package EncapFound;

/**
 * @author 张 书航
 */


public class Homework01 {
    public static void main(String[] args) {
        StringBuffer sB = new StringBuffer();
        sB = sB.append("abcdef");
        try {
            reverse(sB, 1, sB.length() - 2);//传入数组的范围
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void reverse(StringBuffer s, int start, int end) {
        if (!(s != null && end >= start && start >= 0 && end < s.length())) {
            throw new RuntimeException("参数不合法");
        }
        for (int i = start; i <= end / 2; i++) {
            char temp = s.charAt(i);
            s.replace(i, i + 1, s.charAt(end - i + start) + "");
            s.replace(end - i + start, end - i + start + 1, temp + "");
        }
        System.out.println("字符串反转后为" + s);
    }

}
