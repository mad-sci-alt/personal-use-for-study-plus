package annotation;

/**
 * @author 张 书航
 */

@SuppressWarnings("all")
class A {
    private String name = "李四";

    public void f1() {
        class B {
            private final String name;

            private B(String name) {
                this.name = name;///final属性有且仅有在定义是没有初始化才能在该属性所在的类构造器中被修改🌟一次🌟
            }

            void show() {
                System.out.println(name + " " + A.this.name);
            }
        }
        B zs = new B("张三");
        zs.show();
    }

}

public class Homework05 {
    public static void main(String[] args) {
        new A().f1();
    }
}
