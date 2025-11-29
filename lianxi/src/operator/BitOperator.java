package operator;
//&、|、^、逻辑类位运算符，需要两个数及以上参与
// ~、<<、>>、>>>  直接操作类位运算符，一个只能操作单个码
// 七种位运算符号使用示例(位运算符仅有逻辑类运算符，短路类运算无意义)
public class BitOperator {
    public static void main(String[] args) {
        int a = 12>>2;//二进制码整体向右位移两位1100(12)-->0011(3)
        System.out.println(a);
        a = a<<3;
        System.out.println(a);
        int b = 12;
        double c = a&b;//a 24(0001 1000)
                       //b 12(0000 1100)====>0000 1000 输出结果8
        double d = a|b;//0001 1000
                       //0000 1100===>0001 1100===>输出结果为28.0，可知位运算符在都为0的位上直接跳过照搬
        System.out.println(c);
        System.out.println(d);
        double e = -d;
        e = ~(int)e;//10000000 00000000 00000000 00011100===>11111111 1111111 1111111 11100011 得到反码
                    //最低位加一得到计算机可运算的补码==>11111111 11111111 11111111 11100100
                    //再进行按位取反~计算得==>00000000 00000000 00000000 00000000 00011011==>27
        System.out.println(e);//输出27.0
        System.out.println("=================");
        int i = 66;
        System.out.println(++i+i);//67
        System.out.println(i+++i);
        int a1 = 15;
        String a2 = a1+"";//其他类型转字符串

        System.out.println(a1+a2);
        //int a1 = (int)a2; 错误写法，字符串转其他类型不能用强制类型转换，需要用parse包里的方法，写法如下
        int a3 = Integer.parseInt(a2);
        System.out.println(a3+a1);//成功转为int整型，与其他整型+拼接变成了值相加

    }
}
