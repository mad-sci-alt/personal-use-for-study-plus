package DesignMode;

class BoyFriend{
    /// 饿汉式单例三步走
    /// 1.将需要单例的类中的构造器私有化
    /// 2.在类中直接创建私有静态对象（私有是为了防止外部调用破坏单例，静态为了能获取返回对象）
    /// 3.在类中提供一个公共静态方法，用于返回对象
    /// 为什么叫饿汉式单例，因为只要🌟类加载🌟了就会在类内部自动创建对象，不会出现线程安全问题，但是创建后如果不用会造成资源的浪费
    private static String name;
    private static BoyFriend bf = new BoyFriend("Jerry");

    private BoyFriend(String name){
        System.out.println("SingleMode的构造器");
        this.name = name;
    }
    public static BoyFriend getBoyFriend(){
        return bf;
    }

    public static void setBoyFriend(BoyFriend by) {
        BoyFriend.bf = by;
    }

    @Override
    public String toString() {
        return "BoyFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Single {
    public static void main(String[] args) {
        BoyFriend instance = BoyFriend.getBoyFriend();
        System.out.println(instance.toString());
    }
}

/// 下面是懒汉式单例的演示，懒汉式单例的实现原理和饿汉式单例一样，
///只是饿汉式单例是在类加载的时候就创建对象，懒汉式单例是在调用的时候才创建对象，不用就不会创建避免了资源的浪费
class LazyBoyFriend{
    private String name;
    private static LazyBoyFriend bf;
    private LazyBoyFriend(String name) {
        this.name = name;
    }

    public static LazyBoyFriend getBf() {
        if (bf == null){
           bf  = new LazyBoyFriend("Tom");
        }
        return bf;
    }

    @Override
    public String toString() {
        return "LazyBoyFriend{" +
                "name='" + name + '\'' +
                '}';
    }

}

class SingleMode{
    public static void main(String[] args) {
        LazyBoyFriend bf = LazyBoyFriend.getBf();
        System.out.println(bf);
        ///如果类注解@Override重写了toString方法，
        ///那么直接打印打印对象时，就是调用重写的toString方法


    }

}