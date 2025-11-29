package reader_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 张 书航
 * 处理流演示，高度包装后使用方便简洁
 */
public class BufferedReader_ {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =
                new BufferedReader(new FileReader("d:\\code.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();//在关闭外层流时内层的FileReader节点流也会被关闭
    }
}
