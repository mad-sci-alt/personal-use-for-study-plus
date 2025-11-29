package annotation;

/**
 * @author 张 书航
 */

class Frock {
    private static int currentNum = 100000;
    private int serialNumber;

    public int getSerialNumber() {
        return serialNumber;
    }


    public Frock() {
        serialNumber = getNextNum();
    }

    public static int getNextNum() {
        currentNum += 100;
        return currentNum;
    }
}

public class Homework02 {
    public static void main(String[] args) {
        Frock frock = new Frock();
        System.out.println(frock.getNextNum());
        Frock frock1 = new Frock();
        System.out.println(frock1.getNextNum());
        Frock frock2 = new Frock();
        System.out.println(frock1.getNextNum());
    }
}
