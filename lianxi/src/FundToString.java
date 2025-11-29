public class FundToString {
    public static void main(String[] args) {
//        要将基本数据类型转成字符串，添加 +"" 即可
        int a1 = 123;
        String s1 = a1+"";
        System.out.println(s1);
        double a2 = 321;
        String s2 = a2 +"";
        System.out.println(s1 + ' '+ a2);
        boolean b = true;
        if(b) b = false;
        String s3 = b +"";
        System.out.println(s3);
    }
}
