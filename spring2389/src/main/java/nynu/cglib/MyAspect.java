package nynu.cglib;


import org.apache.log4j.Logger;

/*切面类*/
public class MyAspect {
    /*增强方法*/
    public void log(){
        System.out.println("日志处理");
        Logger logger= Logger.getLogger("");
        logger.info("正在进行---日志处理");
    }
    /*增强方法*/
    public void check(){
        System.out.println("用户检查");
    }
    /*增强方法*/
    public void close(){
        System.out.println("关闭操作");
    }
}
