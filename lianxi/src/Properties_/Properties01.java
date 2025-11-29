package Properties_;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author 张 书航
 * 演示传统读取文件和使用Properties类读取文件
 */
public class Properties01 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br =
//                new BufferedReader(
//                        new FileReader(
//                                "src\\mysql.properties"));
//        String line = "";
//        while ((line = br.readLine()) != null) {
//            String[] split = line.split("=");
//            System.out.println(split[0]+"的值为："+split[1]);
//        }
        Properties properties = new Properties();
        properties.load(new FileReader("src\\mysql.properties"));
        properties.list(System.out);//以标准输出流PrintStream显示
        properties.getProperty("user");
//        properties.forEach((k,v)-> System.out.println(k+"的值为："+v));
    }
}
