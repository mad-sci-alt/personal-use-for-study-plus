package Exception;

/**
 * @author 张 书航
 */

class CalException extends RuntimeException {
    public CalException(String message) {
        super(message);
    }
}
@SuppressWarnings("all")
class EcmDef {

    private int n1;
    private int n2;
    public EcmDef(int n1, int n2) {
        this.n1 = n1;
        if (n2 == 0)throw new CalException("除数不能为0");
        this.n2 = n2;



    }
    public EcmDef(int n1){
        throwE();
    }

    void throwE(){
        throw new CalException("只有输入两个整数才能进行除法运算");
    }
}

public class Homework01 {
    public static void main(String[] args) {
        try {
            new EcmDef(10,0);
        } catch (CalException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("程序继续执行");
    }

}
