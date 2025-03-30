package nynu.pojo;

import nynu.service.StudentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@PropertySource(value = "prop.properties",encoding = "UTF-8")//加载配置文件
public class Student {
    //@Value对简单变量属性注入值
    //@Autowired对对象属性注入值
    //@Value("张三")
    @Value("${student.name}")
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Student(){
        System.out.println("构造方法");
    }
    @PostConstruct
    public void init(){
        System.out.println("init 构造方法后执行");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroy 对象销毁前执行");
    }
}
