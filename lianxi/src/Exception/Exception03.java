package Exception;

import java.util.Scanner;

/**
 * @author 张 书航
 */
class AgeVaryException extends RuntimeException {
    public AgeVaryException(String message) {
        super(message);
    }
}

class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }
}

public class Exception03 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = scanner.nextInt();
        if (!(age > 18 && age < 120)){
            throw new AgeVaryException("年龄不符合要求");
        }

        System.out.println("合法年龄");
    }
}
