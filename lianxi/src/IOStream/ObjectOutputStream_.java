package IOStream;

import java.io.*;

/**
 * @author 张 书航
 */
public class ObjectOutputStream_ {
    public static void main(String[] args) throws IOException {
        String srcPath = "d:\\code.txt";
        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream(srcPath));
        oos.writeChar('a');
        oos.writeInt(10);
        oos.writeBoolean(true);
        oos.writeDouble(10.8);
        oos.writeFloat(10.8f);
        oos.writeUTF("张三");
        oos.writeObject(new Person("张三", 10));
        oos.close();
        System.out.println("写入完毕");
    }
}

class Person implements Serializable{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
