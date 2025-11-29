import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 张 书航
 */

/**
 * Collections工具类
 *   Collections中的常用方法
 * - sort(List)/(List,Comparator) : 默认升序，形参可以额外传入一个comparator自定义排序规则
 * - void reverse(List) : 反转整个list
 * - shuffle(List) : 随机排序
 * - swap(List,int,int) : 交换list中两个索引位置的元素
 * - max/min(Collection) :返回集合中的最大值/最小值
 * - max/min(Collection,Comparator) : 返回集合中的最大值/最小值(Object)，第二个参数可以传入自定义比较器
 * - frequency(Collection,Object) : 返回集合中指定元素出现的次数
 * - copy(List,List) : 将第一个形参的内容复制到第二个形参中
 */
public class Collections_tools {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("张三");
        list.add("张三");
        list.add("张三");
        Collections.sort(list);
        System.out.println(list);

    }
}
