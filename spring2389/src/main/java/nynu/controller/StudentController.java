package nynu.controller;

import nynu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

//当开启了扫描之后,会生成该类的对象,对象名是类名_首字母小写(studentController)
@Controller("studentController")
public class StudentController {
    //生成类对象的同时,完成属性值的注入
    @Resource
    //@Autowired
    StudentService studentService;

    public void studentAdd(){
        System.out.println("----controller从页面获取数据,同时调用service----");
        studentService.userAdd();
        System.out.println("----controller获取到反馈结果给页面----");
    }

    public void setUserService(StudentService userService) {
        this.studentService = userService;
    }
}
