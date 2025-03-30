package nynu.mapper;

import org.springframework.stereotype.Repository;

@Repository
public class StudentMapper {
    public void insert(){
        System.out.println("----执行数据库操作增删改查----");
        System.out.println("mapper层添加");
        System.out.println("----增删改查结果反馈给service----");
    }
}
