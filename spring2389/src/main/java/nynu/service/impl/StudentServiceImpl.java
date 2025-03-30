package nynu.service.impl;

import nynu.mapper.StudentMapper;
import nynu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("studentService")//为什么在impl上加注解而不是接口?
//@Scope("singleton")//作用域
public class StudentServiceImpl implements StudentService {
    //值注入
    @Autowired
    StudentMapper studentMapper;

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public void userAdd(){
        System.out.println("----service去调用mapper----");
        studentMapper.insert();
        System.out.println("Service层添加");
        System.out.println("----service将结果传递给controller----");
    }
}
