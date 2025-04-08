package com.example;

import com.example.bean.User;
import com.example.config.MyBatisPlusConfig;
import com.example.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Scanner;

public class ConsoleApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static UserService userService;

    public static void main(String[] args) {
        // 初始化Spring上下文
        AnnotationConfigApplicationContext context = initSpringContext();
        userService = context.getBean(UserService.class);

        // 主循环控制
        boolean running = true;
        while (running) {
            showMainMenu();
            int choice = getMenuChoice();

            switch (choice) {
                case 1:
                    handleLogin();
                    break;
                case 2:
                    handleRegistration();
                    break;
                case 0:
                    running = false;
                    System.out.println("感谢使用，再见！");
                    break;
                default:
                    System.out.println("无效的选项，请重新输入");
            }
            System.out.println();
        }

        // 关闭资源
        context.close();
        scanner.close();
    }

    private static AnnotationConfigApplicationContext initSpringContext() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MyBatisPlusConfig.class);
        context.scan("com.example");
        context.refresh();
        return context;
    }

    private static void showMainMenu() {
        System.out.println("===== 学生管理系统 =====");
        System.out.println("1. 用户登录");
        System.out.println("2. 用户注册");
        System.out.println("0. 退出系统");
        System.out.print("请输入您的选择：");
    }

    private static int getMenuChoice() {
        while (true) {
            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // 清除输入缓冲区
                return choice;
            } catch (Exception e) {
                System.out.print("输入格式错误，请重新输入数字选项：");
                scanner.nextLine(); // 清除错误输入
            }
        }
    }

    private static void handleLogin() {
        System.out.println("\n===== 用户登录 =====");
        System.out.print("请输入用户名：");
        String username = scanner.nextLine().trim();
        System.out.print("请输入密码：");
        String password = scanner.nextLine().trim();

        try {
            User user = userService.login(username, password);
            System.out.println("\n登录成功！");
            System.out.println("用户信息：");
            System.out.println("用户名：" + user.getUsername());
            System.out.println("所属班级：" + user.getClassName());
        } catch (Exception e) {
            System.out.println("\n登录失败：" + e.getMessage());
        }
    }

    private static void handleRegistration() {
        System.out.println("\n===== 用户注册 =====");
        System.out.print("请输入用户名：");
        String username = scanner.nextLine().trim();
        System.out.print("请输入密码：");
        String password = scanner.nextLine().trim();
        System.out.print("请输入所属班级：");
        String className = scanner.nextLine().trim();

        try {
            boolean success = userService.register(username, password, className);
            if (success) {
                System.out.println("\n注册成功！");
                System.out.println("您现在可以使用新账号登录");
            }
        } catch (Exception e) {
            System.out.println("\n注册失败：" + e.getMessage());
        }
    }
}