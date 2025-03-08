package main;

import service.CashierService;
import service.ProductService;
import service.ProductTypeService;
import service.UserService;
import java.math.BigDecimal;
import java.util.Scanner;

public class SupermarketManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserService userService = new UserService();

        // 登录
        System.out.print("请输入用户名: ");
        String username = scanner.nextLine();
        System.out.print("请输入密码: ");
        String password = scanner.nextLine();

        if (!userService.login(username, password)) {
            System.out.println("登录失败，系统退出！");
            scanner.close();
            return;
        }

        CashierService cashierService = new CashierService();
        ProductService productService = new ProductService();
        ProductTypeService productTypeService = new ProductTypeService();

        while (true) {
            System.out.println("\n=== 超市管理系统 ===");
            System.out.println("1. 新增收银员");
            System.out.println("2. 移除收银员");
            System.out.println("3. 显示收银员列表");
            System.out.println("4. 新增商品");
            System.out.println("5. 移除商品");
            System.out.println("6. 显示商品列表");
            System.out.println("7. 商品入库");
            System.out.println("8. 商品出库");
            System.out.println("9. 新增商品类别");
            System.out.println("10. 移除商品类别");
            System.out.println("11. 显示商品类别列表");
            System.out.println("0. 退出系统");
            System.out.print("请选择操作：");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 清除换行符

            switch (choice) {
                case 1: // 新增收银员
                    System.out.print("请输入账号: ");
                    String account = scanner.nextLine();
                    System.out.print("请输入密码: ");
                    String pwd = scanner.nextLine();
                    System.out.print("请输入姓名: ");
                    String name = scanner.nextLine();
                    System.out.print("请输入性别(M/F): ");
                    char sex = scanner.nextLine().charAt(0);
                    System.out.print("请输入年龄: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // 清除换行符
                    System.out.print("请输入联系方式: ");
                    String phone = scanner.nextLine();
                    System.out.print("请输入地址: ");
                    String address = scanner.nextLine();
                    cashierService.addCashier(account, pwd, name, sex, age, phone, address);
                    break;

                case 2: // 移除收银员
                    System.out.print("请输入要移除的收银员ID: ");
                    String cashierId = scanner.nextLine();
                    cashierService.removeCashier(cashierId);
                    break;

                case 3: // 显示收银员列表
                    cashierService.showCashierList();
                    break;

                case 4: // 新增商品
                    System.out.print("请输入商品名称: ");
                    String productName = scanner.nextLine();
                    System.out.print("请输入商品价格: ");
                    BigDecimal price = scanner.nextBigDecimal();
                    System.out.print("请输入商品数量: ");
                    int count = scanner.nextInt();
                    scanner.nextLine(); // 清除换行符
                    System.out.print("请输入商品类别ID: ");
                    String typeId = scanner.nextLine();
                    productService.addProduct(productName, price, count, typeId);
                    break;

                case 5: // 移除商品
                    System.out.print("请输入要移除的商品ID: ");
                    String productId = scanner.nextLine();
                    productService.removeProduct(productId);
                    break;

                case 6: // 显示商品列表
                    productService.showProductList();
                    break;

                case 7: // 商品入库
                    System.out.print("请输入商品ID: ");
                    String addStockProductId = scanner.nextLine();
                    System.out.print("请输入入库数量: ");
                    int addQuantity = scanner.nextInt();
                    scanner.nextLine(); // 清除换行符
                    productService.addStock(addStockProductId, addQuantity);
                    break;

                case 8: // 商品出库
                    System.out.print("请输入商品ID: ");
                    String removeStockProductId = scanner.nextLine();
                    System.out.print("请输入出库数量: ");
                    int removeQuantity = scanner.nextInt();
                    scanner.nextLine(); // 清除换行符
                    productService.removeStock(removeStockProductId, removeQuantity);
                    break;

                case 9: // 新增商品类别
                    System.out.print("请输入商品类别名称: ");
                    String productTypeName = scanner.nextLine();
                    productTypeService.addProductType(productTypeName);
                    break;

                case 10: // 移除商品类别
                    System.out.print("请输入要移除的商品类别ID: ");
                    String productTypeId = scanner.nextLine();
                    productTypeService.removeProductType(productTypeId);
                    break;

                case 11: // 显示商品类别列表
                    productTypeService.showProductTypeList();
                    break;

                case 0:
                    System.out.println("系统退出！");
                    scanner.close();
                    return;

                default:
                    System.out.println("无效的选择，请重新输入！");
            }
        }
    }
}
