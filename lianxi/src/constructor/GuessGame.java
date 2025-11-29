package constructor;

import java.util.Scanner;

class ComputerInit {
    int whichOne;

    public ComputerInit() {
        this.whichOne = (int) (Math.random() * 3);
    }
}

class Judge {
    int userChoice;
    int whichOne;
    int flag;


    public int judge(int userChoice, int whichOne) {
        this.userChoice = userChoice;
        this.whichOne = whichOne;
        if (userChoice == whichOne) {
            return 0;///平局
        } else if (userChoice == whichOne + 1 && userChoice <= 2 && userChoice >= 0) return -1;///剪刀-拳头或布-剪刀，总结为~输
        else if (userChoice + 1 == whichOne && userChoice <= 2 && userChoice >= 0) return 1;///拳头-剪刀或剪刀-布，总结为~赢
        else if (userChoice == whichOne + 2 && userChoice <= 2 && userChoice >= 0) return 1;///布-石头，总结隔板为~赢
        else if (userChoice + 2 == whichOne && userChoice <= 2 && userChoice >= 0) return -1;///石头-布，总结隔板~输
        else return -2;///~用户输入有误
    }

    public String res(int flag) {
        this.flag = flag;
        if (flag == 1) return "你赢了";
        else if (flag == -1) return "你输了";
        else if (flag == 0) return "平局";
        else return "输入有误";
    }

    public void print(int count, String res) {
        System.out.println("=====================");
        System.out.println("当前的局数\t你的出拳\t\t电脑出拳\t\t输赢情况");
        System.out.println(count + "\t\t\t" + this.userChoice + "\t\t\t" + this.whichOne + "\t\t\t" + res);
    }
}

public class GuessGame {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("比赛开始!");

        int count = 1;
        while (count <= 3) {
            System.out.println("第" + count + "局，请输入你的选择（0-石头，1-剪刀，2-布）：");
            int userChoice = myScanner.nextInt();

            // 验证用户输入
            if (userChoice < 0 || userChoice > 2) {
                System.out.println("输入有误，请输入0、1或2");
                continue;
            }

            ComputerInit init = new ComputerInit();
            Judge myJudge = new Judge();
            int flag = myJudge.judge(userChoice, init.whichOne);
            String str = myJudge.res(flag);
            myJudge.print(count, str);
            count++;
        }
    }
}

