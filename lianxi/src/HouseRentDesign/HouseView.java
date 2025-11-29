package HouseRentDesign;


import java.util.Scanner;

public class HouseView {
    private boolean loop = true;
    Scanner myScanner = new Scanner(System.in);
    private int choice;
    // 使用单个HouseService实例
    private HouseService houseService = new HouseService();

    public void mainMenu(){
        do {
            System.out.println("=========房屋出租系统=========");
            System.out.println("\t\t1.新 增 房 源");
            System.out.println("\t\t2.查 找 房 屋");
            System.out.println("\t\t3.删 除 房 屋");
            System.out.println("\t\t4.修 改 房 屋 信 息");
            System.out.println("\t\t5.房 屋 列 表");
            System.out.println("\t\t6.退       出");
            System.out.println("请输入要办理业务的数字");
            choice = myScanner.nextInt();

            if (choice == 6){
                System.out.println("是否确认退出系统？（y/n）");
                if (myScanner.next().charAt(0) == 'y'){
                    loop = false;
                }
            } else {
                houseService.control(choice); // 使用同一实例
            }
        } while (loop);
    }
}
/*
/// 属性顺序如下：编号 房主 电话 地址 月租 状态（已出租/未出租）
public class HouseView {
    private boolean loop = true;
    Scanner myScanner = new Scanner(System.in);
    private int choice;
    private HouseService houseService = new HouseService();


    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    public void mainMenu(){
        do {
            System.out.println("=========房屋出租系统=========");
            System.out.println("\t\t1.新 增 房 源");
            System.out.println("\t\t2.查 找 房 屋");
            System.out.println("\t\t3.删 除 房 屋");
            System.out.println("\t\t4.修 改 房 屋 信 息");
            System.out.println("\t\t5.房 屋 列 表");
            System.out.println("\t\t6.退       出");
            System.out.println("请输入要办理业务的数字");
            choice = Utility.readChar();
            if (choice == 6){
                System.out.println("是否确认退出系统？（y/n）");
                if (myScanner.next().charAt(0) == 'y'){
                    loop = false;
                }

            }else new HouseService().control(choice);

        } while (loop);
    }
}
*/