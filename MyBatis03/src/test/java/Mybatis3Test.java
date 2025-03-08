import nynu.mapper.CustomerMapper;
import nynu.pojo.Customer;
import nynu.utils.MyBatisUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mybatis3Test {
    CustomerMapper customerMapper;
    SqlSession sqlSession;
    @Before /*调用前自动执行*/
    public void before(){

        sqlSession = MyBatisUtils.getSession();
        //Mybatis框架提供借助sqlSession类方法生成mapper类对象，将mapper接口和对应的xml结合起来
        customerMapper=sqlSession.getMapper(CustomerMapper.class);
    }
    @After /*调用后自动执行*/
    public void after(){
        sqlSession.close();
    }

    @Test
    public void findCustomerByUsernameAndJobsTest()
    {
        Customer customer=new Customer();
        List<Customer> customerList=customerMapper.findCustomerByUsernameAndJobs(customer);
        for(Customer customer2:customerList){
            System.out.println(customer2);
        }
    }

    @Test
    public void findCustomerByUsernameAndJobsTest2()
    {
        Customer customer=new Customer();
        customer.setUsername("张");
        List<Customer> customerList=customerMapper.findCustomerByUsernameAndJobs(customer);
        for(Customer customer2:customerList){
            System.out.println(customer2);
        }
    }

    @Test
    public void findCustomerByUsernameAndJobsTest3()
    {
        Customer customer=new Customer();
        customer.setUsername("张");
        customer.setJobs("学生");
        List<Customer> customerList=customerMapper.findCustomerByUsernameAndJobs(customer);
        for(Customer customer2:customerList){
            System.out.println(customer2);
        }
    }

    @Test
    public void findCustomerByUsernameAndJobsTest4()
    {
        Customer customer=new Customer();
        customer.setJobs("学生");
        List<Customer> customerList=customerMapper.findCustomerByUsernameAndJobs(customer);
        for(Customer customer2:customerList){
            System.out.println(customer2);
        }
    }
    @Test
    public void findCustomerByUsernameAndJobs2Test()
    {
        Customer customer=new Customer();
        List<Customer> customerList=customerMapper.findCustomerByUsernameAndJobs2(customer);
        for(Customer customer2:customerList){
            System.out.println(customer2);
        }
    }
    @Test
    public void findCustomerByUsernameAndJobs3Test()
    {
        Customer customer=new Customer();
        List<Customer> customerList=customerMapper.findCustomerByUsernameAndJobs3(customer);
        for(Customer customer2:customerList){
            System.out.println(customer2);
        }
    }
    @Test
    public void findCustomerByUsernameAndJobs4Test()
    {
        Customer customer=new Customer();
        List<Customer> customerList=customerMapper.findCustomerByUsernameAndJobs4(customer);
        for(Customer customer2:customerList){
            System.out.println(customer2);
        }
    }
    @Test
    public void findCustomerByUsernameAndJobs4Test2()
    {
        Customer customer=new Customer();
        customer.setUsername("张");
        List<Customer> customerList=customerMapper.findCustomerByUsernameAndJobs4(customer);
        for(Customer customer2:customerList){
            System.out.println(customer2);
        }
    }
    @Test
    public void findCustomerByUsernameAndJobs4Test3()
    {
        Customer customer=new Customer();
        customer.setUsername("张");
        customer.setJobs("学生");
        List<Customer> customerList=customerMapper.findCustomerByUsernameAndJobs4(customer);
        for(Customer customer2:customerList){
            System.out.println(customer2);
        }
    }
    @Test
    public void findCustomerByIdsTest(){
        List<Customer> customerList=customerMapper.findCustomerByIds(3);
        for(Customer customer2:customerList){
            System.out.println(customer2);
        }
    }
    @Test
    public void updateCustomerTest(){
        Customer customer=new Customer();
        customer.setUsername("哪吒");
        customer.setId(2);
        //customer.setPhone("123345");
        customer.setJobs("神话任务");
        customerMapper.updateCustomer(customer);
        sqlSession.commit();
    }
    @Test
    public void updateCustomer2Test(){
        Customer customer=new Customer();
        customer.setUsername("哪吒");
        customer.setId(2);
        customer.setPhone("123345");
        customer.setJobs("神话任务");
        customerMapper.updateCustomer2(customer);
        sqlSession.commit();
    }
    @Test
    public void updateCustomer3Test(){
        Customer customer=new Customer();
        customer.setUsername("哪吒");
        customer.setId(2);
        customer.setPhone("123345");
        customer.setJobs("神话任务");
        customerMapper.updateCustomer3(customer);
        sqlSession.commit();
    }
    /*想找学号是1的3的5的*/
    // 容器：数组、列表、map
    @Test
    public void selectArrayTest(){
        //Integer[]idsArray1={1,3,5};
        Integer[]ids=new Integer[3];
        ids[0]=1;ids[1]=3;ids[2]=5;
        List<Customer> customerList=customerMapper.selectArray(ids);
        for (Customer customer:customerList)//遍历列表输出
            System.out.println(customer);
    }
    @Test
    public void selectListTest(){
        List<Integer> idsList=new ArrayList<Integer>();
        idsList.add(1);
        idsList.add(3);
        idsList.add(5);
        List<Customer> customerList=customerMapper.selectList(idsList);
        for (Customer customer:customerList)//遍历列表输出
            System.out.println(customer);
    }

    @Test
    public void selectMapTest(){
        List<Integer> idsList=new ArrayList<Integer>();
        idsList.add(1);
        idsList.add(3);
        idsList.add(5);
        Map map=new HashMap();
        map.put("ids",idsList);//键值对
        List<Customer> customerList=customerMapper.selectMap(map);
        for (Customer customer:customerList)//遍历列表输出
            System.out.println(customer);
    }

    @Test
    public void selectMap2Test(){
        List<Integer> idsList=new ArrayList<Integer>();
        idsList.add(1);
        idsList.add(3);
        idsList.add(5);
        Map map=new HashMap();
        map.put("ids",idsList);//键值对
        map.put("name","张");
        List<Customer> customerList=customerMapper.selectMap2(map);
        for (Customer customer:customerList)//遍历列表输出
            System.out.println(customer);
    }

    @Test
    public void selectMap3Test(){
        List<Integer> idsList=new ArrayList<Integer>();
        idsList.add(1);
        idsList.add(3);
        idsList.add(5);
        Map map=new HashMap();
        map.put("ids",idsList);//键值对
        List<Customer> customerList=customerMapper.selectMap3(map,"张");
        for (Customer customer:customerList)//遍历列表输出
            System.out.println(customer);
    }

    @Test
    public void deleteManyTest(){
        List<Integer> idsList=new ArrayList<Integer>();
        idsList.add(1);
        idsList.add(3);
        idsList.add(5);
        Map map=new HashMap();
        map.put("ids",idsList);//键值对
        Integer row=customerMapper.deleteManyParameter(map,"张");
        sqlSession.commit();
    }

    @Test
    public void insertCustomerTest(){
        Customer customer=new Customer();
        customer.setUsername("单个添加");
        customer.setPhone("0377");
        customer.setJobs("神话任务");
        Integer row=customerMapper.insertCustomer(customer);
        if(row>0)System.out.println("添加成功,添加了"+row+"行");
        sqlSession.commit();
    }

    @Test
    public void insertCustomer2Test(){
        Customer customer1=new Customer();
        customer1.setUsername("哪吒");
        customer1.setPhone("0377");
        customer1.setJobs("神话任务");

        Customer customer2=new Customer();
        customer2.setUsername("nit");
        customer2.setPhone("0377");
        customer2.setJobs("神话任务");

        Customer[] customers={customer1,customer2};
        Integer row=customerMapper.insertCustomer2(customers);
        if(row>0)System.out.println("添加成功,添加了"+row+"行");
        sqlSession.commit();
    }

    @Test
    public void insertCustomer3Test(){
        Customer customer1=new Customer();
        customer1.setUsername("哪吒");
        customer1.setPhone("0377");
        customer1.setJobs("神话任务");

        Customer customer2=new Customer();
        customer2.setUsername("nit");
        customer2.setPhone("0377");
        customer2.setJobs("神话任务");

       //Customer[] customers={customer1,customer2};
        List<Customer> customerList=new ArrayList<Customer>();
        customerList.add(customer1);
        customerList.add(customer2);

        Integer row=customerMapper.insertCustomer3(customerList);
        if(row>0)System.out.println("添加成功,添加了"+row+"行");
        sqlSession.commit();
    }

    @Test
    public void insertCustomer4Test(){
        Map map=new HashMap();
        map.put("username","扬子");

        Map map2=new HashMap();
        map2.put("keys",map);
        Integer row=customerMapper.insertCustomer4(map);
        if(row>0)System.out.println("添加成功,添加了"+row+"行");
        sqlSession.commit();
    }

}
