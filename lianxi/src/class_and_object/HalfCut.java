package class_and_object;
import java.util.Scanner;
class T{
    public int solve(int d){
            if (d == 1)return 1;
            else return (solve(d-1)+1)*2;
    }
}
public class HalfCut {
    public static void main(String[] args) {
        T t = new T();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入当猴子吃到第几天才发现只有一个桃了");
        int d = myScanner.nextInt();
        int res = t.solve(d);
        System.out.println("一共有"+res+"个桃子");
    }

}
