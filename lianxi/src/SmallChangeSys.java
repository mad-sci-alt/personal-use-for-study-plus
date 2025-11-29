import java.util.Scanner;

class Menu{
    private double balance;
    private double in;
    private double out;

    public Menu(double balance, double in, double out) {
        this.balance = balance;
        this.in = in;
        this.out = out;
    }

    public String printMenu(){
        return "----------零钱通菜单----------\n"+"\t\t1.零钱通明细\n"+"\t\t2.收益入账\n"+"\t\t3.消费\n"+
                "\t\t4.退 出\n"+"请输入对应的1-4激活对应功能";
    }

    public String getDetailsAdd() {
        return "----------零钱通明细----------\n"+"收益入账 +"+this.in+"\t2025-8-21 16:37\t余额 "+(this.balance+this.in);
    }

    public String getDetailsOut() {
        return "----------零钱通明细----------\n"+"消费 -"+this.out+"\t2025-8-21 16:37\t余额 "+(this.balance+this.out);
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getIn() {
        return in;
    }

    public void setIn(double in) {
        this.in = in;
    }

    public double getOut() {
        return out;
    }

    public void setOut(double out) {
        this.out = out;
    }
}

public class SmallChangeSys {
    public static void main(String[] args) {
        Menu menu = new Menu(0,0,0);
        Scanner input = new Scanner(System.in);
        int userInput = 0;
        do {
            System.out.println(menu.printMenu());
            userInput = input.nextInt();
            if (userInput == 1){
                System.out.println(menu.getDetailsAdd());
            }
            if (userInput == 2){
                System.out.println("请输入入账金额");
                menu.setIn(input.nextDouble());
                menu.getDetailsAdd();
                System.out.println(menu.getDetailsAdd());
            }
            if (userInput == 3){
                System.out.println("请输入消费金额");
                menu.setOut(input.nextDouble());
                menu.getDetailsOut();
                System.out.println(menu.getDetailsAdd());
            }
            if (userInput == 4) {
                System.out.println("退出零钱通");
            }
        } while (userInput != 4);
    }
}
