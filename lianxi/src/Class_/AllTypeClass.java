package Class_;

import java.io.Serializable;

/**
 * @author 张 书航
 * 实验所有有Class类对象的类
 */
public class AllTypeClass {
    public static void main(String[] args) {
        Class<String> cls1 = String.class;//外部类
        Class<Serializable> cls2 = Serializable.class;//接口
        Class<Integer[]> cls3 = Integer[].class;//数组
        Class<int[][]> cls4 = int[][].class;//二维数组
        Class<Deprecated> cls5 = Deprecated.class;//注解
        Class<Thread.State> cls6 = Thread.State.class;//枚举
        Class<Long> cls7 = long.class;//基本数据类型
        Class<Void> cls8 = void.class;//void类型
        Class<Class> cls9 = Class.class;//Class类
    }
}
