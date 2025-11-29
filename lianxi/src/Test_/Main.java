package Test_;

/**
 * @author 张 书航
 */
import java.util.Scanner;

@SuppressWarnings("all")
public class Main{
    static Scanner ms=new Scanner(System.in);
    public static void main(String[] args){
        char in = ms.next().charAt(0);
        printTriangle(in);
    }
    /*
      A
     ABA
    ABCBA
    */
    static void printTriangle(char in){
        int n = in - 'A' + 1; // 计算要打印的行数
        for(int i = 1; i <= n; i++){
            // 打印前导空格
            for(int s = i; s < n; s++){
                System.out.print(" ");
            }

            // 打印递增字符
            for(int j = 1; j <= i; j++){
                System.out.print((char)('A' + j - 1));
            }

            // 打印递减字符
            for(int k = i - 1; k >= 1; k--){
                System.out.print((char)('A' + k - 1));
            }

            System.out.println();
        }
    }


}