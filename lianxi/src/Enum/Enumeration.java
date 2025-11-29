package Enum;

/**
 * @author 张 书航
 */
public class Enumeration {
    public static void main(String[] args) {
        System.out.println(Season1.SPRING);
        System.out.println(Season1.SUMMER);
        System.out.println(Season2.AUTUMN);
    }
}
/// 枚举的写法
 @SuppressWarnings("all")
enum Season1{

    SPRING("春天","春暖花开"),
    SUMMER("夏天","烈日炎炎"),
    AUTUMN("秋天","秋风瑟瑟"),
    WINTER("冬天","冰天雪地");
    private Season1(String name,String desc){
        this.name=name;
        this.desc=desc;
    }
    private String name;
    private String desc;

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
    /// 如果不重写toString方法，那么enum枚举打印对象时，就是直接打印对象名
    /// 枚举类的对象则是Enum.类名.地址
    @Override
    public String toString() {
        return getName()+"的感觉是"+getDesc();
    }
}
/// 枚举类的写法，可以感受一下其中的区别
@SuppressWarnings("all")
class Season2{
    public static final Season2 SPRING=new Season2("春天","春暖花开");
    public static final Season2 SUMMER=new Season2("夏天","烈日炎炎");
    public static final Season2 AUTUMN=new Season2("秋天","秋风瑟瑟");
    public static final Season2 WINTER=new Season2("冬天","冰天雪地");
    private String name;
    private String desc;
    private Season2(String name,String desc){
        this.name=name;
        this.desc=desc;
    }
    @Deprecated
    public Season2() {

    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }


}

