public class fuzhi {
    public static void main(String[] args) {
        byte b1 = 127;
        byte b3 = 3;

        int b2 = b1 + b3;//byte、short只要一种类型参与运算便最少要int直接接收
        short b4 = (short) (b1 + b3);//此种强类型转换仅适用于自己知道自己拿值在做什么最好还是扩大精度
        System.out.println(b2);
        System.out.println(b4);
    }
}
