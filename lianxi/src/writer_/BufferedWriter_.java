package writer_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 张 书航
 */
public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\input.txt";
        BufferedWriter bufferedWriter =
                new BufferedWriter(new FileWriter(filePath,false/*追加?true:false*/));
        bufferedWriter.write("hello,world!");
        bufferedWriter.newLine();
        bufferedWriter.write("hello,world!");
        bufferedWriter.newLine();
        bufferedWriter.write("hello,world!");
        bufferedWriter.flush();
    }
}
