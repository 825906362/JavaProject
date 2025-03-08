package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
//工具类 用于读取配置文件

public class ConfigUtils {
    public static Properties loadProperties(String filename) {
        Properties props = new Properties();
        try (InputStream input = ConfigUtils.class.getClassLoader().getResourceAsStream(filename)) {
            if (input == null) {
                System.out.println("抱歉，无法找到配置文件：" + filename);
                return null;
            }
            props.load(input);
        } catch (Exception e) {
            System.out.println("读取配置文件出错: " + e.getMessage());
        }
        return props;
    }
}
