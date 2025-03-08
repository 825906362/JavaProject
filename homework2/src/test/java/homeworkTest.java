import cn.nynu.mapper.EmployeeMapper;
import cn.nynu.pojo.Employee;
import cn.nynu.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class homeworkTest {
    SqlSession sqlSession;
    EmployeeMapper employeeMapper;

    @Before
    public void before() {
        sqlSession = MyBatisUtils.getSession();
        employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
    }

    @After
    public void after() {
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void SelectTest1() {
        Employee employee = employeeMapper.selectById(1);  // 正确接收 Employee 对象
        System.out.println(employee);
    }

    @Test
    public void InsertTest2() {
        Employee employee=new Employee();
        employee.setName("李四");
        employee.setAge(10);
        employee.setPosition("人员");
        Integer row=employeeMapper.insertEmployee(employee);
        System.out.println("添加了"+row+"行");
        System.out.println(employee);
    }

    @Test
    public void DeleteTest3() {
        Integer row=employeeMapper.deleteEmployee(2);
        System.out.println("删除了"+row+"行");
    }

    @Test
    public void UpdateTest4() {
        Employee employee=new Employee();
        employee.setId(1);
        employee.setName("李四");
        employee.setAge(18);
        employee.setPosition("人员");
        Integer row=employeeMapper.updateEmployee(employee);
        System.out.println("修改了"+row+"行");
    }
}