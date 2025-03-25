package com.itheima.test;

import com.itheima.service.UserService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryTest {
    public static void main(String[] args){
        // 1. 创建工厂对象
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 创建XML配置读取器（修正类名拼写错误）
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);

        // 3. 加载XML配置文件（需指定资源路径）
        reader.loadBeanDefinitions("beans.xml");

        // 4. 根据名称获取Bean实例（注意Bean名称大小写）
        UserService userService = (UserService) beanFactory.getBean("userService");
        System.out.println(userService);
    }
}