package nynu.pojo;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/*lombok
* 1.添加依赖
* 2。刷新maven
* */
/*@Getter
@Setter
@ToString*/
public class TbIdCard {
    Integer id;
    String code;
    String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "TbIdCard{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
