package Set_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author 张 书航
 */
//@SuppressWarnings("all")
public class TressSet_ {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
///                return ((Car) o1).getName().length()
//                       - ((Car) o2).getName().length();
                if (((Car) o1).getName().length() != ((Car) o2).getName().length()){
                    return ((Car) o1).getName().length()    ///首先按name长度升序排序
                            - ((Car) o2).getName().length();
                }
                if (((Car) o1).getPrice() == ((Car) o2).getPrice()){//name长度相同时，按price升序排序
                    return ((Car) o1).getName().compareTo(((Car) o2).getName());
                }
                return Double.compare(((Car)o1).getPrice(),((Car)o2).getPrice());
                //在前面的排序都无法满足时，按price升序排序
                /// 注：返回前形参减后形参（在原数组是正遍历时）都是从小到大排序（升序）
            }
        });
        treeSet.add(new Car("ford", 100));
        treeSet.add(new Car("Asuro", 200));
        System.out.println(treeSet);
    }
}
