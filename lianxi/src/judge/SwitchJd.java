package judge;

import java.util.Scanner;
//🌟🌟🌟特定顺序字母表示顺序规则模块
public class SwitchJd {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个字符");
        char day = myScanner.next().charAt(0);
        switch(day){//switch表达式的返回值（常量）类型必须要与case的值保持一致，或者能互相自动类型转换
                    //只能是举例子范围里的：byte 、short 、 int 、 char 、 enum 、 String
            case 'a'://case中不能是变量名
                System.out.println("星期一");
                break;//break用来跳出switch语句，不写break会直接执行下一个代码模块，
                      // 不管下一个代码模块的case是否匹配表达式
            case 'b':
                System.out.println("星期二");
                break;
            case 'c':
                System.out.println("星期三");
                break;
            case 'd':
                System.out.println("星期四");
                break;
            case 'e':
                System.out.println("星期五");
                break;
            case 'f':
                System.out.println("星期六");
                break;
            case 'g':
                System.out.println("星期天");
            default://default分支可自由使用，用不用都符合语法规则
                System.out.println("invalid input");
        }
        System.out.println("程序已退出");
    }

}
//🌟小写转为大写模块
class SwitchLowerToUpper{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个小写字母");
        char low = myScanner.next().charAt(0);
        switch(low){
            case 'a':
                low = 'A';
                break;
            case 'b':
                low = 'B';
                break;
            case 'c':
                low = 'C';
                break;
            default:
                System.out.println("other");
        }
        System.out.println(low);
        System.out.println("程序结束");

    }
}
//🌟学生成绩判断是否及格模块
class GradeSwitch{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入学生成绩");
        int MYGRADE = myScanner.nextInt();
        int S = MYGRADE/60;
        switch(S){
            case 1:
                System.out.println("该学生成绩合格");
                break;
            case 0:
                System.out.println("该学生成绩不合格");
                break;
            default:
                System.out.println("invalid input");
        }
    }
}

//🌟运用switch的穿透机制编写输入月份自动判断季节模块
class seasons{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入要判断的月份");
        int month = myScanner.nextInt();
        switch(month){
            case 3:
            case 4:
            case 5:
                System.out.println("该月份为春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("该月份为夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("该月份为秋天");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("该月份为冬天");
                break;
            default:
                System.out.println("无效输入");
        }
    }
}