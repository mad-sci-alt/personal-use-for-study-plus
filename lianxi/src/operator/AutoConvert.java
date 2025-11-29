package operator;

public class AutoConvert {
    public static void main(String[] args) {
        int day = 59;
        int week = day/7;
        int spare = day-week*7;
        System.out.println("还有" + week + "周" + spare + "天放假");

    }
}

class temperature{
    public static void main(String[] args) {
        double hua = 234.5;
        double she = 5.0/9*(hua-100);
        System.out.println(hua + " 华氏度对应的摄氏度为 " + she);
    }
}

class StringToDouble{
    public static void main(String[] args) {
        String s1 = "45.0000000000000003";
        double d1 = Double.parseDouble(s1);
        System.out.println(d1);
    }
}
class CharToString{
    public static void main(String[] args) {
        char c1 = 'b';
        String s2 = c1+"";
        System.out.println(s2);
    }
}