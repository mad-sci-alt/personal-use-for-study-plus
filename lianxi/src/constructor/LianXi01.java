package constructor;
import java.util.Scanner;
class A01{
    double[] nums;
    A01(){/// 构造器初始化数组并键入值
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入待比较的数组长度");
        int length = myScanner.nextInt();
        nums = new double[length];
        System.out.println("请输入"+length+"个待比较的数");
        for (int i = 0;i < nums.length;++i){
            nums[i] = myScanner.nextDouble();
        }
    }
    public double max(A01 dy){
        double max = nums[0];
        for (int i = 1;i < nums.length ;++i){/// 仅仅只是找到数组最大值（单个数）完全不用排序，直接遍历就可以
            if (max < nums[i]){
                max = nums[i];
            }
        }

        return max;
    }

    public void print(double res){
        System.out.println("最大值为："+res);
    }
}

public class LianXi01 {
    public static void main(String[] args) {
        A01 dy = new A01();
        double res = dy.max(dy);
        dy.print(res);
    }
}


class A02{
    String str;
    public int find(String str){
        this.str= str;
        for (int i = 0;i < this.str.length();++i){
            if(this.str.charAt(i) == 'g')return i;
        }

        return 0;
    }
}

class Init{
    public static void main(String[] args) {
        A02 get = new A02();
        int res = get.find("zhangshuhang");
        System.out.println(res);
    }
}

class Book{
    int price;
    public void updatePrice(int price){
        if (price > 150){
            this.price = 150;
        }else if (price > 100){
            this.price = 100;
        }
    }
}
class Update{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输书当前的价格");
        int price = myScanner.nextInt();
        Book book = new Book();
        book.updatePrice(price);
        System.out.println(book.price);
    }
}

class A03{
    int[] arr;
    public void copyArr(int[] arr){
        this.arr = arr;
    }
    public void print(){
        for (int i = 0;i < arr.length;++i){
            System.out.print(arr[i]+ " ");
        }
    }
}
class Copy{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        A03 copy =  new A03();
        copy.copyArr(arr);
        copy.print();
    }
}

class Circle{
    public void circleLength(double r){
        System.out.println("圆的周长为："+2*Math.PI*5);///Math类中的PI方法可以调用比较精确的double类型的π值
    }
    public void circleArea(double r){
        System.out.println("圆的面积为："+Math.PI*r*r);
    }
}
class Get{
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        Scanner myScanner = new Scanner(System.in);
        double r = myScanner.nextDouble();
        myCircle.circleLength(r);
        myCircle.circleArea(r);
    }
}

class CalToolKit{
    int a;
    int b;
    public CalToolKit(int a,int b){
        this.a = a;
        this.b = b;
    }
    int sum(){
        return a+b;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
    int div(){
        if (b != 0){
            return a/b;
        }
        else return -1;
    }
}
class Cale{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入需要计算的两个数字，用空格隔开");
        CalToolKit kit = new CalToolKit(myScanner.nextInt(),myScanner.nextInt());
        System.out.println("和为："+kit.sum());
        System.out.println("差为："+kit.sub());
        System.out.println("乘为："+kit.mul());
        System.out.println("商为："+kit.div());
    }
}

class Dog{
    String name;
    String color;
    int age;

    Dog(String name,String color,int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    void show(){
        System.out.println("该狗狗的名字是："+name+"，颜色是："+color+"，年龄是："+age);
    }
}
class Animal{
    public static void main(String[] args) {
        Dog dog1 = new Dog("小白","白色",5);
        dog1.show();
    }
}

class Music{
    String name;
    String times;

    Music(String name,String times){
        this.name = name;
        this.times = times;
    }
    void play(Music muInfo){
        System.out.println("正在播放："+muInfo.name+" 整曲时长为："+muInfo.times);
    }

}
class MyMusic{
    public static void main(String[] args) {
        Music muInfo = new Music("后来","5min 46s");
        muInfo.play(muInfo);
    }
}

class Employee{
    String name;
    char sex;
    int age;
    String pos;
    double sal;

    Employee(String name,char sex,int age,String pos,double sal){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.pos = pos;
        this.sal = sal;
    }
    Employee(String name,char sex,int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    Employee(String pos,double sal){
        this.pos = pos;
        this.sal = sal;
    }
}

class InitInfo{
    public static void main(String[] args) {
        Employee init = new Employee("张三",'男',18,"程序员",5000);
        System.out.println(init.name+" "+init.sex+" "+init.age+" "+init.pos+" "+init.sal);
    }
}

class Circle01{
    double radius;
    double findArea(double r){
        System.out.println(r+"对应的圆的面积为"+Math.PI*r*r);
        return Math.PI*radius*radius;
    }
}

class PassObject{
    double radius;
    public void printAreas(int times){
        System.out.println("Radius\t\tArea");
        for (int i = 1;i <= times;++i){
            this.radius = i;
            System.out.println(i+"\t\t\t"+Math.PI*i*i);
        }
    }
}
class Main{
    public static void main(String[] args) {
        System.out.println("main方法开始执行...");
        System.out.println("请输入半径的值");
        Scanner myScanner = new Scanner(System.in);
        Circle01 myRadius = new Circle01();
        double r = myScanner.nextDouble();
//        myRadius.findArea(r);
        PassObject loop = new PassObject();
        loop.printAreas(5);

    }
}