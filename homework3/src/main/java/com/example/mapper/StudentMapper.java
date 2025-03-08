package com.example.mapper;

import com.example.entity.Student;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    // 功能1：多条件查询
    List<Student> findByCondition(Student student);

    // 功能2：查询id<5的学生
    List<Student> findByIdLessThan5();

    // 功能3：根据学号列表查询
    List<Student> findByNumbers(@Param("numbers") List<String> studentNumbers);

    // 功能4：批量插入
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int batchInsert(@Param("students") List<Student> students);
}