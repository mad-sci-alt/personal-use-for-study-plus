package Class_;

/**
 * @author 张 书航
 */
public class ClassLoad02_ {
    public static void main(String[] args) {

    }
}

class A {
    /*
    @para name  非静态，因此在准备阶段不会分配内存
    @para serialVersionUID  因为被final修饰，一开始分配内存就为1L
    @para n1    静态变量与类加载有关，一开始为0，在类加载阶段的最后初始化时变为指定的20
     */
    private static final long serialVersionUID = 1L;
    private String name="张书航";
    public int n1=10;
}
