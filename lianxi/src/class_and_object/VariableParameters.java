package class_and_object;

class ZshMethod{
    public void sum(String name,double ...nums){///用可变（同类型不同数量）形参接收,将同名且同功能方法合并成一个方法
        double res = 0;            ///🌟可变参数细节🌟
                                ///1.可变参数可以和其他类型参数一起放在形参列表，但需要将可变项放在最后
                                /// 2.可变参数的形参类型本质为数组类型
                                /// 3.一个形参列表只能有一个可变形参
        for (int i = 0;i < nums.length;++i){
            res += nums[i];
        }
        System.out.println(name+"的"+nums.length+"科总分为:"+res);
    }
}
public class VariableParameters {
    public static void main(String[] args) {
        ZshMethod md = new ZshMethod();
        md.sum("张三",1,2);
        md.sum("李四",1,2,3);
        md.sum("王五",1,2,3,4,5);
    }
}
