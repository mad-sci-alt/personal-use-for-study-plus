package input;
import java.util.Scanner;
public class scan {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("请输入用户的姓名年龄和薪水");
        String name = d.next();
        int age = d.nextInt();
        String salary = d.next();
        System.out.println("该用户的信息如下：");
        System.out.println("姓名" + name + ' ' + "年龄" + age + " " + "薪水" + salary);
    }
}
