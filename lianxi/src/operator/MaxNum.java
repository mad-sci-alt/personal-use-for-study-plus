package operator;

//用三元运算符得到三个数中最大的数（ 用math.max()函数最快 ）
public class MaxNum {
    public static void main(String[] args) {
        int a = 5;int b = 2;int c = 10;
//        int temp = a > b ? a : b;
        int res = (a > b ? a : b) > c ? (a > b ? a : b) : c;
        System.out.println(res);
    }
}
