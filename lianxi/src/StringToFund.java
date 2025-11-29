public class StringToFund {
    public static void main(String[] args) {
        String s1 = "123";
        //字符串转换基本类型
        double a1 = Double.parseDouble(s1);
        float a2 = Float.parseFloat(s1);
        int a3 = Integer.parseInt(s1);
        short a4 = Short.parseShort(s1);
        byte a5 = Byte.parseByte(s1);
        boolean b = Boolean.parseBoolean("true");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(b);

        System.out.println("-------------");

        char s2 = 'a';
        double a = s2;
        System.out.println(a);



    }
}
