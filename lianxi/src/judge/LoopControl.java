package judge;

import java.util.Scanner;

public class LoopControl {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入需要重复打印的语句");
        String word = myScanner.next();
        for (int i = 0;i <= 9;++i) System.out.println(word+i);//打印了十遍
    }
}

class LoopCount{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入需要判断的区间");
        int a = myScanner.nextInt();
        int b = myScanner.nextInt();
        int count = 0;

        for(;a <= b;){
            if(a%9 == 0) {
                System.out.println(a);
                count++;
            }
            a++;

        }
        System.out.println("您输入的区间内一共有" + count + "个符合要求的数");
    }
}

class SumLoop{
    public static void main(String[] args) {
        int i = 0,j = 5;String s = "+";
        for (;i<=5&&j>=0;){
            System.out.println(i+s+j+"="+(i+j));
            i++;j--;
        }
    }
}

class WhileLoop{
    public static void main(String[] args) {
        int i = 1;
        int endNum = 100;
        while(i <= endNum){
            if(i%3 == 0){
                System.out.println(i);
            }
            i++;
        }
        System.out.println("循环结束");
        System.out.println("=====================================================");
        int j = 40;
        int endNum2 = 200;
        while(j <= endNum2){
            if(j%2 == 0){
                System.out.println(j);
            }
            j++;
        }
        System.out.println("循环结束");
    }
}

class DoWhileLoop{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int i = 1;
        System.out.println("请输入循环的次数");
        int endNum = myScanner.nextInt();
        do{
            System.out.println(i);
            ++i;
        }while (i <= endNum);

    }
}

class DoWhileSum{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入要循环相加的次数");
        int endNum = myScanner.nextInt();
        int i = 1;int sum = 0;
        do {
            sum += i;
            i++;
        } while (i <= endNum);
        System.out.println(sum);
    }
}

class DoWhileDivision{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入需要判断的区间");
        int head = myScanner.nextInt();
        int endNum = myScanner.nextInt();
        int sum = 0;
        do {
                if (head %5 == 0 && head %3 !=0 ){
                    System.out.println(head);
                    sum++;
                }
                head++;
        } while ( head <= endNum );
        System.out.println(sum);
    }
}

class AskDebt{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        char answer ;

        do {
            System.out.println("还不还钱？,不还钱打死你\n~~~~~~（一顿毒打后）给你一次机会，还不还钱？（y/n）");
            answer = myScanner.next().charAt(0);
        }while (answer == 'n');
        System.out.println("算你识相，这次就放过你");
    }
}
//🌟🌟🌟多重循环控制完成多个班及学生成绩录入，及自动计算平均分和及格人数
class MultiFor{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请按每个班级为组输入班级的数量和每个班级的人数：");
        int classNum = myScanner.nextInt();

        int Grade;int sum;
        double avg;
        for(int i = 1;i <= classNum;++i){
            sum = 0;avg = 0;int passNum = 0;
            int StNum = myScanner.nextInt();
            System.out.println("请输入该班级学生的成绩，用空格/回车隔开");
            for(int j = 1;j <= StNum;++j){

                 Grade = myScanner.nextInt();
                 if(Grade >= 60 )passNum++;
                 sum +=Grade;
                 avg = sum/(double)StNum;
            }
            System.out.println("第"+i+"个班的"+StNum+"个学生的平均成绩为"+avg+"有"+passNum+"个学生成绩及格");
        }
    }
}
//🌟多重循环控制打印九九乘法表
class MultiTable{
    public static void main(String[] args) {
        for(int i = 1;i <= 9;++i){
            for(int j = 1;j <= i;++j){
                System.out.print(j+" * "+i+" = "+" "+i*j+"    ");
            }
            System.out.print('\n');
        }
    }
}

//🌟🌟🌟🌟多重循环打印空心金字塔
class EmptyTriangle{
    public static void main(String[] args) {
        int layerNum = 9;int empty;
        for(int i = 1;i <= layerNum;i+=2 ){
            empty = (9-i)/2;
            while(empty > 0){
                System.out.print(' ');//根据每层*数量不同控制边距空格数达到每层相对最后一层居中的效果
                empty--;
            }
            if(i == layerNum){
                for(int j = 1;j<=layerNum;++j) System.out.print('*');
            }else {
                for(int j = 1;j <= i;++j){
                    if(j==1 || j== i){
                        System.out.print('*');
                    }else System.out.print(' ');
                }
            }
//            for (int j = 1;j <= i;++j){
//                if(j==9){
//                    System.out.print("*********");
//                }else if (j==1||j==i) System.out.print("*");
//                 else System.out.print(' ');
//
//            }
            System.out.print('\n');
        }
    }
}
//Math.random()方法生成的随机数[0.0,1.0)约18位以内的double类型小数如0.564123196514563545
class BreakUse{
    public static void main(String[] args) {
//        System.out.println(Math.random());
        int a = (int)(Math.random()*100)+1;//生成1~100的随机数
        int count = 0;
        while(true){
            count++;
            System.out.println(a);
            if (a == 97)break;
            a = (int)(Math.random()*100)+1;
        }
        System.out.println("用了"+count+"次生成出97");
    }
}

class BreakSum{
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1;i < 100;++i){
            sum += i;
            if(sum > 20 ) {
                System.out.println("当前第一次和大于20，对应 i= "+i);
                break;
            }
        }
    }
}

class LoginCaptcha{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入用户名和密码");
        String str;
        String pw;
        for(int i =1;i <= 3;++i){
            str = myScanner.next();
            pw = myScanner.next();
            if ("丁真".equals(str) && "666".equals(pw)){//“==”比较的是地址，equals方法比较内容，推荐这里的写法顺序，
                                                        // 可以避免空指针的情况
                System.out.println("登录成功");
                break;
            }else if(i == 3) System.out.println("次数用完，账户已被冻结，请稍候重试");else{
                System.out.println("用户名或密码错误，你还有"+(3-i)+"次机会");
            }
        }
    }
}

class SkipControl{
    public static void main(String[] args) {
        double cash = 100000;
        int count = 0;
        while(true){
            if(cash >50000){
                cash *=0.95;
                count++;
            } else if (cash >= 1000 ) {
                cash -=1000;
                count++;
            }else break;
        }
        System.out.println("可以过"+count+"次路口");
    }
}

class JudgePositive{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入要判断的数字");
        int Num = myScanner.nextInt();
        if (Num > 0){
            System.out.println("该数字为正数");
        }else if (Num == 0){
            System.out.println("等于0");
        }else {
            System.out.println("该数为负数");
        }
    }
}

class RunYear{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入要判断的年份");
        int year = myScanner.nextInt();
        if((year%4==0&&year%100!=0) || year%400==0){
            System.out.println("该年为闰年");
        }else {
            System.out.println("该年不是闰年");
        }
    }
}

class ShuixianFlower {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入要判断的数字");
        int Num = myScanner.nextInt();
        int NumF = Num/100;
        int NumS = Num%100/10;
        int NumT = Num%10;
        int sum = NumF*NumF*NumF+NumS*NumS*NumS+NumT*NumT*NumT;
        if(sum == Num) System.out.println("该数为水仙数");
        else {
            System.out.println("该数不是水仙数");
        }
    }
}

//输出1~100不能被5整除的数🌟🌟实现循环中每打印(count)个数换行一次
class Division{
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1;i <= 100 ;++i){
            if (i%5 !=0) {
                    System.out.print(i+" ");
                    count++;
                    if (count%5 == 0) System.out.println();
            }
        }
    }
}

class LoopConvert{//用ASCII码对应的字母强转，while循环输出a~z和A~Z
    public static void main(String[] args) {
            int zmx = 97;int count = 0;
            while(zmx <= 122){
                count++;
                if (count %14 ==0) System.out.println("");
                System.out.print((char)zmx+ " ");
                zmx++;
            }
            System.out.println('\n'+"==================================================");
            int zmd = 90;
            int count2 = 0;
            while(zmd >= 65 ){
                count2++;
                if (count2 %14 ==0){

                    System.out.println("");
                }
                System.out.print((char)zmd+ " ");
                zmd--;
            }
    }
}

class DirectOutput{
    public static void main(String[] args) {
        for (char c1 = 'a';c1 <= 'z';c1++){
            System.out.print(c1+ " ");
        }
        System.out.println('\n'+"===========================================");
        for (char c2 = 'Z';c2 >= 'A';c2--){
            System.out.print(c2 +" ");
        }
    }
}

class DivideLoop{
    public static void main(String[] args) {
        double sum = 0;
        double divide = 0;
        for (int i = 1;i <= 100;++i){
            if (i%2 != 0){
                divide = 1.0/i;
            }else divide = -1.0/i;
            sum += divide;
        }
        System.out.println("1-1/2+1/3-1/4.....+1/99-1/100 = "+ sum);
        System.out.println('\n'+"======================================");
        int count = 0;
        for (int i = 1;i <= 100;++i){
            for (int j = 1;j <= i;++j){
                count += j;
            }
        }
        System.out.println("1+(1+2)+(1+2+3)+(1+2+3+4)+......+(1+2+.....+100) = "+ count);
    }
}