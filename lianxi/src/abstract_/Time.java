package abstract_;

abstract class CalTime{
    abstract void program(int i);
    public void Cal(){
        long s = System.currentTimeMillis();
        program(50000000);
        long e = System.currentTimeMillis();
        System.out.println("程序运行时间为：" + (e-s) + " ms");
    }
}

class CountTime extends CalTime{
    int num;

    @Override
    void program(int i) {
        for (int j = 0; j < i; j++) {
            num *= j;
        }
    }

    public int getNum() {
        return num;
    }


    public void setNum(int num) {
        this.num = num;
    }
}



public class Time {
    public static void main(String[] args) {
        new CountTime().Cal();
    }
}

interface IA{
    void cry();
}

class Outer {

    IA Outer = new IA(){
        @Override
        public void cry() {
            System.out.println("匿名内部类实现了");
        }
    };
}