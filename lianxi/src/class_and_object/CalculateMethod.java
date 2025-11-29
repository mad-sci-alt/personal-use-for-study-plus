package class_and_object;
/**🌟🌟重要！！🌟🌟成员方法getSum程序的流程顺序
 * 1.首先创建类的对象，同时栈内生成对象名初始化(基本数据类型)变量
 *   在main方法栈内执行到对象的方法调用时，会创建一个独立的方法栈空间来接收方法传的变量地址并进行计算最后作为方法的返回值(如果是void类型的方法则不会返回值)
 * 2.方法调用完毕并返回值给main栈内，可以进行接收赋给变量，此时独立的方法栈便已经程序退出，此时继续执行main方法后面的代码
 * 3.main栈内执行完毕后，整个程序退出
 * =============================
 * 1.cal01作为Method01类的成员方法/行为预加载到JVM虚拟机内存中的方法区中
 * 2.要想调用Method01类中的方法，必须要先在堆里创建空间存储对象内容（类中的方法和成员变量），
 * 对象创建后，栈内同时生成与对象地址相同的对象地址（栈内只存着一个对象名称对应的🌟编码地址🌟指向堆内对象），
 * 如果默认/指定初始化是基本数据类型就将值存放在堆内对象储存内，
 * 如果是引用类型（类、接口、数组、等 String也是一个类，只不过是官方定义的,所以也属于引用类型）则存储在方法区内的的常量池，
 * 堆内对象空间有地址指向常量
 * */
class Method01{
    public String speak(){
        return "我是一个好人";
    }

    public void cal01(int n){
        int sum = 0;
        System.out.println("我正在计算");
        for (int i = 1;i <= n;++i)sum += i;
        System.out.println("从一加到"+n+"的和为"+sum);
    }

    public int getSum(int i,int j){
        return i+j;
    }
}

public class CalculateMethod{
    public static void main(String[] args) {
        Method01 say = new Method01();
        String out = say.speak();
        System.out.println(out);
        Method01 js = new Method01();
        js.cal01(1000);
        System.out.println("两数和为"+js.getSum(1,10));
    }
}