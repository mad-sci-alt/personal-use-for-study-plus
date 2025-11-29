package writer_;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 张 书航
 */
public class FileWriter_ {
    public static void main(String[] args) {

    }

    @Test
    void fileWriter() {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("D:\\code.txt");
            fileWriter.write("这是我的更新");
            fileWriter.write("这是我的更新".toCharArray(), 0, 5);
            fileWriter.write("这是我的更新", 0, 6);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

