package MathClass;

/**
 * @author 张 书航
 */
public class Random {
    public static void main(String[] args) {
        double num = Math.random() * 6 + 2;
        System.out.println(num);//获取范围在[2,8)的随机数
        System.out.println(Math.round(num));//四舍五入
        System.out.println(Math.ceil(num));//向上取整
        System.out.println(Math.floor(num));///向下取整获取[2,7]的随机整数
        System.out.println(num);
    }
}
