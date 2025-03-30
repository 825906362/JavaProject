package nynu.pojo;

import java.util.List;
import java.util.Map;

public class User {
    public Map<String, Integer> getScoreMap() {
        return scoreMap;
    }

    public void setScoreMap(Map<String, Integer> scoreMap) {
        this.scoreMap = scoreMap;
    }

    Integer id;
    String name;
    String password;
    List<String> addressList;
    Map<String,Integer> scoreMap;

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

    public List<String> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<String> addressList) {
        this.addressList = addressList;
    }


}
