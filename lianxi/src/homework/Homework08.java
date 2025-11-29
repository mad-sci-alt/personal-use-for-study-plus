package homework;

import java.util.Scanner;

class BankAccount{
    private double balance;
    public BankAccount(double initBalance){
        this.balance = initBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    /// 存钱
    public void deposit(double amount){
        balance += amount;
    }
    /// 取钱
    public void withDraw(double amount){
        balance -= amount;
    }
}

class CheckingAccount extends BankAccount {
    private int cut = 1;
    public CheckingAccount(double initBalance){
        super(initBalance);
    }

    public void deposit(double amount){
        setBalance(getBalance()+amount-cut);
        System.out.println("存钱成功，当前余额为："+getBalance());
    }

    public void withDraw(double amount) {
        setBalance(getBalance()-amount-cut);
        System.out.println("取钱成功，当前余额为："+getBalance());
    }
}

class SavingAccount extends BankAccount{
    public int chance = 3;
    boolean flag = true;
    int choice;


    public SavingAccount(double initBalance){
        super(initBalance);
    }

    public void earnMonthlyInterest(){
        System.out.println("计算利息成功，当前余额为："+getBalance()+'\n'+"已重置免费的三次存款/取款机会");///月末
        this.chance = 3;
    }

    public void deposit(double amount){
        if (chance > 0){// 有免费机会不收手续费
            setBalance(getBalance()+amount);
            chance--;
        }else {
            setBalance(getBalance()+amount-1);
        }
        System.out.println("存钱成功，当前余额为："+getBalance());
    }

    public void withDraw(double amount){
        if (chance > 0){
            setBalance(getBalance() - amount);
            chance--;
        }else {
            setBalance(getBalance() - amount - 1);
        }
        System.out.println("取钱成功，当前余额为："+getBalance());
    }

    public void businessMenu(){
        System.out.println("当前账户余额为：" + this.getBalance()+'\n'+"=====当前业务=====\n"+"1.存钱\n"+"2.取钱\n"+"请输入");
    }
    public void start(){
        do {
            businessMenu();
            choice = new Scanner(System.in).nextInt();
            if (choice == 1){
                System.out.println("请输入要存的钱数：");
                this.deposit(new Scanner(System.in).nextDouble());
            }else if (choice == 2){
                System.out.println("请输入要取的钱数：");
                this.withDraw(new Scanner(System.in).nextDouble());
            }
            System.out.println("是否继续进行业务？(y/n)");
            if (new Scanner(System.in).next().charAt(0) == 'y'){
                flag = true;
            } else if (new Scanner(System.in).next().charAt(0) == 'n') {
                flag = false;
            }
        }while (flag);
    }
}

public class Homework08 {
    public static void main(String[] args) {
        SavingAccount myAccount = new SavingAccount(0);
        myAccount.start();
    }
}
