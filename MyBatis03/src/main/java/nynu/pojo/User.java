package nynu.pojo;

public class User {
    Integer uid;
    String uname;
    Integer uage;
    Integer userPass;


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getUage() {
        return uage;
    }

    public void setUage(Integer uage) {
        this.uage = uage;
    }

    public Integer getUserPass() {
        return userPass;
    }

    public void setUserPass(Integer userPass) {
        this.userPass = userPass;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", uage=" + uage +
                ", userPass=" + userPass +
                '}';
    }
}
