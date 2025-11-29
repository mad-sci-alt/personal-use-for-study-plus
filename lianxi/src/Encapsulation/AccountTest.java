package Encapsulation;

import java.util.Scanner;

class Account{
    public String name;
    private double remainMoney;
    private String passWord;

    Scanner myScanner = new Scanner(System.in);

    public void setName() {
        System.out.println("请输入用户名:");
        this.name = name = myScanner.next();
        if (name.length() < 2 || name.length() > 4)name = "匿名";//给默认值
    }

    public void setRemainMoney() {
        System.out.println("请输入余额:");
        this.remainMoney = myScanner.nextDouble();
        if (remainMoney < 20)remainMoney = 20;//非法则赋默认值
    }

    public void setPassWord() {
        System.out.println("请输入密码:");
        this.passWord = myScanner.next();
        if (passWord.length() != 6)passWord = "000000";//默认值
    }

    public void getInfo(){
        System.out.println("用户名:"+name+'\n'+"密码:"+passWord+'\n'+"余额:"+remainMoney);
    }
}

public class AccountTest {
    public static void main(String[] args) {
        Account myAccount1 = new Account();
        myAccount1.setName();
        myAccount1.setRemainMoney();
        myAccount1.setPassWord();
        myAccount1.getInfo();
    }
}
