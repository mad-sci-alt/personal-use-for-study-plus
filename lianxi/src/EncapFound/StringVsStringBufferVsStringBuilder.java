package EncapFound;

/**
 * @author 张 书航
 */
public class StringVsStringBufferVsStringBuilder {
    public static void main(String[] args) {
        String text = "";
        long s1 = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            text += i;
        }
        long e1 = System.currentTimeMillis();
        System.out.println("String运行时间：" + (e1 - s1) + "ms");
        StringBuffer buffer = new StringBuffer();
        long s2 = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            buffer.append(i);
        }
        long e2 = System.currentTimeMillis();
        System.out.println("StringBuffer运行时间：" + (e2 - s2) + " ms");
        StringBuilder builder = new StringBuilder();
        long s3 = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            builder.append(i);
        }
        long e3 = System.currentTimeMillis();
        System.out.println("StringBuilder运行时间：" + (e3 - s3) + "ms");
    }
}
