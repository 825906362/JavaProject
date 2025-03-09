
import com.example.entity.Student;
import com.example.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class StudentMapperTest {
    private static SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    private StudentMapper mapper;

    // 一次性初始化（整个测试类只执行一次）
    @BeforeClass
    public static void setUpBeforeClass() throws IOException {
        try (InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml")) {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }
    }

    // 每个测试方法前执行
    @Before
    public void setUp() {
        sqlSession = sqlSessionFactory.openSession();
        mapper = sqlSession.getMapper(StudentMapper.class);
    }

    // 每个测试方法后执行
    @After
    public void tearDown() {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }
    @Test
    public void testFindByCondition() {
        // 场景1：按姓名查询
        Student condition1 = new Student();
        condition1.setStudentName("张三");
        List<Student> result1 = mapper.findByCondition(condition1);
        if(!result1.isEmpty())System.out.println(result1);

        // 场景2：按专业查询
        Student condition2 = new Student();
        condition2.setMajor("计算机科学");
        List<Student> result2 = mapper.findByCondition(condition2);
        if(!result2.isEmpty())System.out.println(result2);

        // 场景3：无参数查询所有
        List<Student> result3 = mapper.findByCondition(new Student());
        if(!result3.isEmpty())System.out.println(result3);
    }


    @Test
    public void testFindByIdLessThan5() {
        // 执行查询
        List<Student> result = mapper.findByIdLessThan5();
        if (!result.isEmpty()) {
            for (Student i : result) {
                System.out.println(i);
            }
        }

    }

    @Test
    public void testFindByNumbers() {
        // 准备测试数据
        List<String> numbers = Arrays.asList("S2024004", "S2024003", "S2024001","S2024005");

        // 执行查询
        List<Student> result = mapper.findByNumbers(numbers);
        if (!result.isEmpty()) {
            for (Student i : result) {
                System.out.println(i);
            }
        }
    }

    @Test
    public void testBatchInsert() {
        // 准备测试数据
        List<Student> students = Arrays.asList(
                new Student("批量1", "CS", "S2024004"),
                new Student("批量2", null, "S2024005"),
                new Student("批量3", "Math", "S2024006")
        );

        // 执行批量插入
        int affectedRows = mapper.batchInsert(students);
        sqlSession.commit(); // 手动提交事务

        if(affectedRows!=0)System.out.println("成功插入："+affectedRows+"行");
    }

}