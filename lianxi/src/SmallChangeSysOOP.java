import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 创建SmallChangeSysOOP类用作逻辑和功能的封装
 */

public class SmallChangeSysOOP {
    private String details;
    private double balance;
    private double inCash;
    private double outCash;
    int userInput;
    Date date = new Date();
    Scanner myScanner = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat();
    String note = "";
    boolean flag = true;

    public SmallChangeSysOOP() {
    }

    public void start() {
        do {

            System.out.println(Menus.printMenu());
            userInput = myScanner.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println(this.getDetails());
                    break;
                case 2:
                    System.out.println("请输入入账金额");
                    this.setInCash(myScanner.nextDouble());
                    if (this.getInCash() <= 0){
                        System.out.println("入账金额应大于0");
                        break;
                    }
                    this.setBalance(this.getBalance() + this.getInCash());
                    this.setDetails(this.getDetails()+"\n收益入账\t+"+this.getInCash()+'\t'+ sdf.format(date)+'\t'+"余额："+this.getBalance());   ///实时获取当前的简化时间信息，以便拼接
                    break;
                case 3:
                    System.out.println("请输入消费金额");
                    this.setOutCash(myScanner.nextDouble());
                    if (this.getOutCash() > this.getBalance()){
                        System.out.println("余额不足，消费失败");
                        break;
                    }
                    this.setBalance(this.getBalance()-this.getOutCash());
                    System.out.println("请输入消费项目");
                    note = myScanner.next();
                    this.setDetails(this.getDetails()+'\n'+note+"\t-"+this.getOutCash()+'\t'+sdf.format(date)+"\t余额"+this.getBalance());
                    break;
                case 4:
                    System.out.println("是否确认退出?(y/n)");
                    char judge = myScanner.next().charAt(0);
                    if (judge != 'y' && judge != 'n'){
                        System.out.println("输入有误，请重新输入");
                        break;
                    }
                    if (judge == 'y'){
                        System.out.println("==========已退出零钱通系统==========");
                        flag = false;
                    }
                    break;
            }
        } while (flag);
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getOutCash() {
        return outCash;
    }

    public void setOutCash(double outCash) {
        this.outCash = outCash;
    }

    public double getInCash() {
        return inCash;
    }

    public void setInCash(double inCash) {
        this.inCash = inCash;
    }
}

abstract class Menus {
    public static String printMenu(){
        return "\n----------零钱通菜单----------\n"+"\t\t1.零钱通明细\n"+"\t\t2.收益入账\n"+"\t\t3.消费\n"+
                "\t\t4.退 出\n"+"请输入对应的1-4激活对应功能";
    }

}
