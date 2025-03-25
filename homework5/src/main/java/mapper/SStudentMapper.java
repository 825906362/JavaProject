package mapper;

import org.apache.ibatis.annotations.*;
import pojo.CClass;
import pojo.SStudent;

public interface SStudentMapper {
//  通过Student_ID查询班级（一对一）
    @Select("select s_student.*,c_class.class_name from s_student,c_class" +
            " where s_student.cid=c_class.class_id and s_student.student_id=#{studentId}")
    @Results({
            @Result(property = "studentId",column = "student_id"),
            @Result(property = "cid",column = "cid"),
            @Result(property = "studentName",column = "student_name"),
            @Result(
                    property = "className" ,column = "cid",
                    one=@One(select = "selectClassByCid")
            )
    })
    SStudent selectStudentById(Integer studentId);

    @Select("select class_name from c_class where class_id=#{cid}")
    String selectClassByCid(Integer cid);


//  通过Class_ID查询学生（一对多）
    @Select("select * from c_class where class_id=#{classId}")
    @Results({
            @Result(property = "classId",column = "class_id"),
            @Result(property = "className",column = "class_name"),
            @Result(
                    property = "sStudentList", column = "class_id",
                    many=@Many(select = "selectStudentByCid")
            )
    })
    CClass selectClassById(Integer classId);

    @Select("select * from s_student where cid=#{Cid}")
    SStudent selectStudentByCid(Integer Cid);

    /*update s_student set student_name='',age=19 where student_id=4;*/
    @Update("update s_student set student_name=#{studentName},age=#{age} where student_id=#{studentId}")
    Integer UpdateStudentByIdAge(@Param("studentId") Integer studentId,@Param("studentName") String studentName,@Param("age") Integer age);

}
