package generic;

/**
 * @author 张 书航
 */
@SuppressWarnings("all")
/// 自定义泛型
public class CustomizeGeneric {
    public static void main(String[] args) {
        new MyArrayList<String,Integer,String,String>();
        MyArrayList list = new MyArrayList<>();
        //不写也是对的，不写默认就全是Object泛型
    }
}
@SuppressWarnings("all")
class MyArrayList<E,EE,T,A>{
    E[] e;//泛型数组不能初始化
    E name;
    EE age;
    T T;
    A A;
    public void add(E e){
        //...
    }
    public E get(int index){
        //...
        return null;
    }
}
