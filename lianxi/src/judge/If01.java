package judge;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {
        Scanner people = new Scanner(System.in);
        System.out.println("请输入你的年龄");
        int age = people.nextInt();
        if(age >= 18){
            System.out.println("你是成年人，需要对自己的行为负责");
        }
    }
}

class If02 {
    public static void main(String[] args) {
        Scanner myD = new Scanner(System.in);
        System.out.println("请输入两个数");
        double d1 = myD.nextDouble();
        double d2 = myD.nextDouble();
        if(d2 > 10.0 && d2 < 20.0){
            double sum = d1 + d2;
            System.out.println(sum);
        }
        System.out.println("程序结束");
    }
}

class If03{
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);
        System.out.println("请输入两个数，我会判断其和是否既能被3整除又能被5整除");
        int i1 = myNum.nextInt();
        int i2 = myNum.nextInt();
        int sum = i1 + i2;
        if (sum % 3 == 0 && sum % 5 == 0) {
            System.out.println("两数和可以被3和5整除");
        } else if (sum % 3 == 0 & sum % 5 != 0) {
            System.out.println("两数和只能被3整除");
        } else if (sum % 5 == 0 && sum % 3 != 0) {
            System.out.println("两数和只能被5整除");
        } else if (sum % 5 != 0 && sum % 3 != 0) {
            System.out.println("3和5都不能整除两数和");
        }
    }
}

class YearJudge{
    public static void main(String[] args) {
        Scanner myYear = new Scanner(System.in);
        System.out.println("请输入一个年份，我会判断其是否为闰年");
        int year = myYear.nextInt();
        if( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("该年为闰年");
        }else{
            System.out.println("该年不是闰年");
        }
        System.out.println("======================"  + "程序终止");
    }
}

class MultiJudge{
    public static void main(String[] args) {
        Scanner multiJg = new Scanner(System.in);
        System.out.println("请输入保国同志的信用分（0~100）");
        int score = multiJg.nextInt();
        if(score >= 0 && score <=100) {
            if (score == 100) {
                System.out.println("信用极好");
            } else if (score > 80 && score <= 99) {
                System.out.println("信用优秀");
            } else if (score <= 80 && score >= 60) {
                System.out.println("信用一般");
            } else {
                System.out.println("不及格");
            }
        }else {
            System.out.println("无效分数");
        }
    }
}

class NestedJudge{
    public static void main(String[] args) {
        Scanner eJg = new Scanner(System.in);
        System.out.println("请输入选手的成绩");
        double score = eJg.nextDouble();


        if(score > 8.0){                       // (老美以0为第一个开头,如果是.charAt(1)的话就是得到第二个字符)
            System.out.println("请输入性别");    //.charAt(0)方法可以得到string类型的第一个字符
            char gender = eJg.next().charAt(0);//此方法可以将字符串拆分为单个字符
            if(gender == '男'){
                System.out.println("您已进入男子组下一轮比赛");
            }else if(gender == '女'){
                System.out.println("您已进入女子组下一轮比赛");
            }else {
                System.out.println("无效性别");
            }
        }else {
            System.out.println("您已被淘汰");
        }
    }
}

class TicketPrice{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入当前月份");
        int month = myScanner.nextInt();
        if ( month >= 4 && month <= 10 ){
            System.out.println("当前是旺季，票价如下："
                    + '\n' + "成人（18~60）：60\n儿童（<18）：半价\n老人（>60）:1/3");
        } else if ( (month>=1&&month<4) || (month>10&&month<=12) ) {
            System.out.println("当前是淡季，票价如下："+ '\n' + "成人（18~60）：40\n其他：20");
        }else {
            System.out.println("无效月份输入（月份应在1~12）");
        }
    }
}