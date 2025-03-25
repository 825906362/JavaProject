package nynu.pojo;

public class User {
    Integer id;
    String name;
    String password;

    public User(){
        System.out.println("无参构造函数");
    }

    public User(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
        System.out.println("有三参构造函数");
    }


    public void setId(Integer id) {
        this.id = id;
        System.out.println("set Id");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("set name");
    }

    public void setPassword(String password) {
        this.password = password;
        System.out.println("set password");
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
