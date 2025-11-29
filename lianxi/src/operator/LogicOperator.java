package operator;

public class LogicOperator {
    public static void main(String[] args) {
//        byte a = 2;
//        short b = 32766;
//        short c = (short) (a + b);
//        System.out.println(c);
//        long integer = (long) (9e18+1e17);
//        System.out.println(integer);
        int a = (int)(2e10);long b = (int) 2e10;//int类型的正整数上限
        System.out.println(a + "and" + b);
        System.out.println("------------");
        Boolean flag = a==b;

        int a1 = 1;int b1 = 10;

        double res = a1 > b1 ? b1++ : a1++;
        System.out.println(a1 + "and" + b1);
        System.out.println("res="+res);
        System.out.println("a1="+a1);

    }
}