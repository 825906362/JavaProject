package nynu.jdk;


public class ProductServiceImpl implements ProductService{
    /*
    连接点:可以增强的方法
    切入点:已经选择增强的连接点
    */
    public void insert(){
        System.out.println("添加");
    }
    public void delete(){
        System.out.println("删除");
    }
    public void update(){
        System.out.println("更新");
    }
}
