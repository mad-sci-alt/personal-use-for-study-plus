package IOStream;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 张 书航
 */
public class FileOutputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void writeFile() throws IOException {
        String path = "d:\\hello.txt";
        FileOutputStream fOS = new FileOutputStream(path);
        String input = "hello";
        fOS.write(input.getBytes());
        fOS.write("，world!".getBytes());


    }
}
