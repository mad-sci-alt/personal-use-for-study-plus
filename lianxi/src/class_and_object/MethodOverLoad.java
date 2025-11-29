package class_and_object;

class OverLoad{
    public int calculate(int a , int b){
        System.out.println("int");
        return a + b;
    }
    public double calculate(int a ,double b){
        System.out.println("double");
        return a + b;
    }
    public double calculate(double b, int a){
        System.out.println("reverse double");
        return a + b;
    }
    public int calculate(int a , int b ,int c){
        System.out.println("triple int");
        return a + b + c;
    }

    public int m(int a){
        return a*a;
    }
    public int m(int a,int b){
        return a*b;
    }
    public void m(String str){
        System.out.println(str);
    }
}
public class MethodOverLoad {
    public static void main(String[] args) {
        OverLoad newCal = new OverLoad();
        int result1 = newCal.calculate(1,1);///重载的方法可以达到用同一个方法名完成不同形参的输入
        double result2 = newCal.calculate(1,1.1);
        int result3 = newCal.calculate(1,1,1);
        newCal.m("str");
    }
}

class Methods{
    public int max(int a,int b){
        return Math.max(a,b);///a>b?a:b;三元运算符
    }
    public double max(double a,double b){
        return Math.max(a,b);
    }
    public double max(double a,double b,double c){
        return Math.max(Math.max(a,b),c);
    }
}

class Main{
    public static void main(String[] args) {
        Methods myMd = new Methods();
        System.out.println(myMd.max(1,2));
        System.out.println(myMd.max(1.1,2.2));
        System.out.println(myMd.max(1.1,2.2,3.3));
    }
}
