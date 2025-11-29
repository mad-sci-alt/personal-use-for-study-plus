import java.util.Arrays;
import java.util.Scanner;

class Method {
    public void speak() {
        System.out.println("我会speak");
        Method02 inCall = new Method02();//方法内部 创建方法对象并调用方法
        inCall.say();
    }
}

class Method02 {
    public void say() {
        System.out.println("我会say");
    }
}

public class InternalMethodCall {
    public static void main(String[] args) {
        Method call = new Method();
        call.speak();
    }
}

class Judge {
    public boolean isOdd(int n) {
        return n % 2 != 0;
    }
}

class Execute {
    public static void main(String[] args) {
        Judge judge = new Judge();
        boolean flag = judge.isOdd(-5);
        if (flag) System.out.println("输入数为奇数");
        else System.out.println("输入数为偶数");
    }
}

class ArrayJudge {
    private String[][] arr;  // 改为String类型并提升为成员变量

    public void createArray() {/// 创建二维数组并键入
        Scanner myScanner = new Scanner(System.in);
        System.out.print("请输入二维数组的行数: ");
        int row = myScanner.nextInt();
        arr = new String[row][];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("请输入第" + (i + 1) + "行的元素个数: ");
            int cols = myScanner.nextInt();
            arr[i] = new String[cols];

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("输入元素[" + i + "][" + j + "]: ");
                arr[i][j] = myScanner.next();  // 使用next()避免换行问题
            }
        }
        System.out.println("成功创建二维数组！");
    }

    public void queryElement() {///判断输入索引是否越界,并查询输入索引对应二维数组，输出索引对应的值
        Scanner myScanner = new Scanner(System.in);
        while (true) {
            System.out.print("输入要查询的行索引: ");
            int rowIndex = myScanner.nextInt();
            System.out.print("输入要查询的列索引: ");
            int colIndex = myScanner.nextInt();

            if (isValidIndex(rowIndex, colIndex)) {
                System.out.println("查询结果: " + arr[rowIndex][colIndex]);
                return;
            }
            System.out.println("索引越界！请重新输入");
        }
    }

    private boolean isValidIndex(int row, int col) {/// private类型的成员方法只能本类调用
        return row >= 0 && row < arr.length &&
                col >= 0 && col < arr[row].length;
    }
}

class MainEntrance {
    public static void main(String[] args) {
        ArrayJudge call = new ArrayJudge();
        call.createArray();
        call.queryElement();
    }
}

/**
 * 我自己的版本，缺少输入索引越界判断，以及结构混在一起了，最好把功能在一个类名内拆分成两个方法，在主函数内用哪个功能在创建对应对象后直接调用即可
 * <p>
 * class ArrayJudge{
 * public void judge(int rowIndex,int lineIndex){
 * int[][] arr;
 * Scanner myScanner = new Scanner(System.in);
 * System.out.println("请输入二维数组中一维数组的数量/行数");
 * int row = myScanner.nextInt();
 * arr = new int[row][];
 * for (int i = 0;i < arr.length;++i){
 * System.out.println("请输入第"+(i+1)+"行一维数组的元素个数，并键入元素的值");
 * int line = myScanner.nextInt();
 * arr[i] = new int[line];
 * for (int j = 0;j < arr[i].length;++j){//循环输入第(i+1)个一维数组/行中的元素
 * int num = myScanner.nextInt();
 * arr[i][j] = num;
 * System.out.println("本行数组长度如下arr["+i+"]["+j+"]");
 * }
 * }
 * System.out.println("成功创建并键入二维数组！请输入要查询的索引（第几个一维数组中的第几个元素）");
 * rowIndex = myScanner.nextInt();
 * lineIndex = myScanner.nextInt();
 * System.out.println("成功查询目标索引内容为:"+arr[rowIndex][lineIndex]);
 * <p>
 * }
 * }
 * //31
 * class MainEntrance{
 * public static void main(String[] args) {
 * ArrayJudge call = new ArrayJudge();
 * call.judge(2,2);
 * }
 * }
 */

class ArrayTest {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        final String[][] arr = new String[myScanner.nextInt()][];
        String[] str = {"me"};
        System.out.println(Arrays.toString(str));
    }
}