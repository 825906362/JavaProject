package service;

import entity.Cashier;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;

public class CashierService {
    // 存储收银员信息的Map，ID为Key，Cashier对象为Value
    private Map<String, Cashier> cashierMap = new HashMap<>();

    // 新增收银员
    public void addCashier(String account, String password, String name, char sex, int age, String phoneNumber, String address) {
        // 检查账号是否存在
        if (isAccountExists(account)) {
            System.out.println("账号已存在，请重新输入！");
            return;
        }

        // 验证年龄和联系方式的合法性
        if (!isValidAge(age) || !isValidPhoneNumber(phoneNumber)) {
            System.out.println("年龄或联系方式格式不正确！");
            return;
        }

        // 使用UUID自动生成ID
        String id = UUID.randomUUID().toString();
        Cashier cashier = new Cashier(id, account, password, name, sex, age, phoneNumber, address);
        cashierMap.put(id, cashier);
        System.out.println("收银员添加成功: " + cashier);
    }

    // 根据ID移除收银员
    public void removeCashier(String id) {
        if (cashierMap.containsKey(id)) {
            cashierMap.remove(id);
            System.out.println("收银员ID " + id + " 已移除");
        } else {
            System.out.println("未找到该ID的收银员！");
        }
    }

    // 显示收银员列表
    public void showCashierList() {
        if (cashierMap.isEmpty()) {
            System.out.println("当前没有收银员记录。");
        } else {
            cashierMap.values().forEach(System.out::println);
        }
    }

    // 检查账号是否存在
    private boolean isAccountExists(String account) {
        return cashierMap.values().stream().anyMatch(c -> c.getAccount().equals(account));
    }

    // 验证年龄合法性
    private boolean isValidAge(int age) {
        return age >= 18 && age <= 65;
    }

    // 验证手机号格式
    private boolean isValidPhoneNumber(String phoneNumber) {
        // 简单的手机号正则校验
        return Pattern.matches("^\\d{10,11}$", phoneNumber);
    }
}
