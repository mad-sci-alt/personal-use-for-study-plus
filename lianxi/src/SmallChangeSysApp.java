/**
 * 零钱通主方法，要用什么直接调用SmallChangeSysOOP类即可，加功能加逻辑判断也在被封装的类中添加，
 * 这就是OOP，向外仅仅提供一个实例化对象方法，即可调用封装类中的所有功能和属性，隐藏了实现细节，不仅方便主方法调用而且安全
 */

public class SmallChangeSysApp {
    public static void main(String[] args) {
        SmallChangeSysOOP scsOOP = new SmallChangeSysOOP();
        scsOOP.setDetails("----------零钱通明细----------");
        scsOOP.start();
    }
}
