package entity;

public class Cashier {
    private String id;              // 系统自动生成的唯一ID
    private String account;         // 账号
    private String password;        // 密码
    private String name;            // 姓名
    private char sex;               // 性别
    private int age;                // 年龄
    private String phoneNumber;     // 手机号
    private String address;         // 地址

    // 构造函数
    public Cashier(String id, String account, String password, String name, char sex, int age, String phoneNumber, String address) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Getter和Setter方法
    public String getId() {
        return id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "收银员[ID=" + id + ", 账号=" + account + ", 姓名=" + name + ", 性别=" + sex + ", 年龄=" + age +
                ", 手机号=" + phoneNumber + ", 地址=" + address + "]";
    }
}
