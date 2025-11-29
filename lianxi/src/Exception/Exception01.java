package Exception;

/**
 * @author 张 书航
 */
public class Exception01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println(new RuntimeException(e));
        }

        System.out.println("程序继续执行");

    }
}