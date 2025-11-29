package Properties_;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author 张 书航
 * set方法如果指定的key存在就是修改，不存在则是创建
 */
public class Properties02 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("charset", "utf8");
        properties.setProperty("user", "张书航");
        properties.setProperty("pwd", "zsh421023");
        properties.store(new FileOutputStream("src\\mysql2.properties"), null);
        System.out.println("保存配置文件成功");
    }
}
