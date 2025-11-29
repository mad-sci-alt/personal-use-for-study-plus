package constructor;
class Use{
    String inter;
    int num;
    Use(String inter,int num){///直接用跟成员变量名一致的形参初始化成员变量，好
        this.inter = inter;   ///好处是不用起新的变量名，因为本来这个变量就是要付给成员变量的
        this.num = num;       ///但是如果我们在赋值时inter = inter是自我原地复制，所以引用一个JDK自带的变量方法this以示区分
    }

    public void print(){
        System.out.println("类型:"+inter+"  编号:"+num);
    }
}
public class ThisUse {
    public static void main(String[] args) {
        Use u1 = new Use("接口序列",1);
        u1.print();
    }
}

class ThisUse01{
    public static void main(String[] args) {
        This t = new This();
    }
}
class This{
    This(){
        System.out.println("无参构造方法执行了");

    }
}
