package input;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class ArrayUse {
    public static void main(String[] args) {
        int a[] = new int[1000000];
        Scanner myScanner = new Scanner(System.in);
        System.out.println("输入数组的内容,以0结束");
        for (int i = 0; i < a.length; i++){
            a[i] = myScanner.nextInt();//每次将键入的值存储到对应i位置的数组中
            if(a[i] == 0)break;
        }
        for (int i = 0; i < a.length; i++){
            System.out.println("数组a中的第"+(i+1)+"个位置存储的值是"+a[i]);
            if (a[i] == 0)break;
        }
    }
}

class CharArray{//用数组循环打印26个字母
    public static void main(String[] args) {
        char[] arr;
        char f = 'A';
        arr = new char[26];
        for (int i = 0;i < arr.length;++i){
            arr[i] = f;
            System.out.print(arr[i]+" ");
            f++;
        }
    }
}

class cmp{//找出数组中的最大值并返回其在数组中的索引
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入数组的长度");
        int n = myScanner.nextInt();
        int[] a = new int[n];
        System.out.println("请输入数组存的值");
        for (int i = 0; i < a.length; i++){
            a[i] = myScanner.nextInt();
        }
        int max = 0;
        int maxIndex = 0;
        for(int i = 0; i < a.length-1; i ++){
            max = (a[i] > a[i+1])?a[i]:a[i+1];
            a[i+1] = max;
            maxIndex  =i + 1;
        }
        System.out.println("数组中的最大值为第"+maxIndex+"个，值为"+max);
    }
}

class ArrayAssign{/// 数组赋值给数组的继承机制为引用赋值（数组中地址的拷贝，包括地址对应的值）
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("请输入5个数字作为int数组a的值");
        for (int i = 0;i < a.length;++i){
            a[i] = myScanner.nextInt();
        }
        System.out.print("数组a的值为:");
        for (int i = 0;i < a.length;++i){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int[] b;
        b = a;
        System.out.print("在将数组a赋给数组b后，数组b的内容为:");
        for(int i = 0;i < b.length;++i){
            System.out.print(b[i]+" ");
        }
        System.out.println("改变b中存储的值");
        b[0] = 100;b[1] = 200;
        System.out.print("在改变数组b的内容后，数组a的内容为:");
        for (int i = 0;i < a.length;++i){
            System.out.print(a[i]+" ");
        }

    }
}

class ArrayReverseKey1{//找规律反转数组
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};//反转前的数组
        for (int i = 0;i < a.length/2;++i){
            int temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
        }
        for (int i = 0;i < a.length;++i){
            System.out.print(a[i]+" ");//循环输出反转后的数组
        }
    }
}

class ArrayReverseKey2{//先拷贝一份🌟独立🌟的数组，再进行对位赋值达到数组反转
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = new int[a.length];
        for (int i = 0;i < a.length;++i){
            b[i] = a[a.length-1-i];
        }
        for (int i = 0;i < b.length;++i){
            System.out.print(b[i]+" ");
        }
        a = b;//将反转数组的地址覆盖原本正序地址，a和b指向同一块内存，回收掉此刻a的引用地址，a原来的数组空间会被垃圾自动回收机制回收
    }
}

class ArrayAdd{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);//Scanner 对象和初始化数组arr需要定义在循环外面，
        int[] arr = {1,2,3,4,5};                   // 否则每次循环都会初始化一个新的Scanner对象和数组arr,
        while (true){                              //导致每次循环输入的数组长度都为5，且上个循环添加的数丢失
            int[] arrNew = new int[arr.length+1];
            System.out.println("当前数组为");
            for (int i = 0;i < arr.length;++i){
                arrNew [i] = arr [i];
                System.out.print(+arr[i]+" ");
            }
            System.out.println('\n'+"请输入要添加到arrNew后面的数");
            arrNew[arrNew.length-1] = myScanner.nextInt();
            for (int i = 0;i < arrNew.length;++i) System.out.print(arrNew[i]+" ");
            arr = arrNew;//将新数组的地址赋给arr
            System.out.println('\n'+"添加成功！"+'\n'+"将arrNew的地址赋给arr后，arr的值为：");
            for (int i = 0;i < arr.length;++i) System.out.print(arr[i]+" ");
            System.out.println('\n'+"是否继续添加？y/n");
            char Judge = myScanner.next().charAt(0);
            if (Judge == 'n')break;
        }
    }

}

class ArrayAdd2{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        while(true){
            int arrNew[] = new int[arr.length+1];
            System.out.println("请输入要添加的数");
            for (int i = 0;i < arr.length;++i)arrNew[i] = arr[i];
            arrNew[arrNew.length - 1] = myScanner.nextInt();
            arr = arrNew;
            System.out.println("添加成功！当前数组为：");
            for (int i = 0;i < arr.length;++i) System.out.print(arr[i]+" ");
            System.out.println("\n是否继续添加？y/n");
            char judge = myScanner.next().charAt(0);
            if (judge == 'n')break;
        }
    }
}

class ArrayReduce{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        char judge;
        do {
            System.out.println("删除数组arr尾数");
            int[] arrNew = new int[arr.length - 1];
            if (arr.length > 1) {
                for (int i = 0; i < arrNew.length; ++i) arrNew[i] = arr[i];
            } else {
                System.out.println("数组arr已为空！");
                break;
            }
            arr = arrNew;
            System.out.println("删除成功！当前数组为：");
            for (int i = 0; i < arr.length; ++i) System.out.print(arr[i] + " ");
            System.out.println("\n是否继续删除？y/n");
            judge = myScanner.next().charAt(0);
        } while (judge == 'y');
        System.out.println("已退出删除程序");
    }
}

class ArraySorting{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入数组的长度");
        int Num = myScanner.nextInt();
        int[] arr = new int[Num];
        System.out.println("请输入"+arr.length+"个数字");
        for (int i = 0;i < arr.length;++i){
            arr[i] = myScanner.nextInt();
        }
        for (int k = arr.length;k > 0;--k){//进行冒泡排序
            for (int i = 0,j = 1;j < k;++i,++j  ){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("排序后的数组为：");
        for (int i = 0;i < arr.length;++i) System.out.print(arr[i]+" ");
    }
}

class ArraySearch{//顺序查找
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入数组的长度");
        int length = myScanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0;i < arr.length;++i){
            arr[i] = myScanner.nextInt();
        }
        System.out.println("请输入要查找的数");
        int find = myScanner.nextInt();
        for (int i = 0;i < arr.length;++i){
            if (arr[i] == find) {
                System.out.println("成功查询！该数在数组中的索引/下标为："+i);break;
            }
            else if (i == arr.length-1)System.out.println("未找到该数");
        }
    }
}

class BinarySearch{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入数组的长度");
        int length = myScanner.nextInt();
        int[] arr = new int[length];
        System.out.println("请输入" + arr.length + "个数字");
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = myScanner.nextInt();
        }
        for (int k = arr.length; k > 0; --k) {///进行从小到大的冒泡排序
            for (int i = 0, j = 1; j < k; ++i, ++j) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("请输入要查找的数");
        int find = myScanner.nextInt();
        int left, right, mid;
        boolean found = false;
        for (left = 0, right = arr.length - 1; left <= right; ) {
            mid = left + (right - left) / 2;///🌟🌟🌟我的指针定义方式对应的mid值计算应该如此
            if (arr[mid] == find) {/// 比较的应该是索引对应的数组的值
                System.out.println("找到目标元素" + find + "其在数组中对应下标/索引为" + mid);
                found = true;
                break;
            } else if (arr[mid] > find) {
                right = mid - 1;
            } else {
                left = mid + 1;

            }
        }
        if (!found) System.out.println("未找到目标元素" + find);
    }
}

class TwoDimensionalArray{
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请按组输入二维数组（多个一维数组充当元素的一维数组,这里即三个内存大小为四的一维数组）");
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0;j < arr[i].length;++j){
                arr[i][j] = myScanner.nextInt();
            }
        }
        int first,second;
        System.out.println("请输入需要的二维索引值");
        first = myScanner.nextInt();
        second = myScanner.nextInt();
        System.out.println("对应第"+(first+1)+"个一维数组中的第"+(second+1)+"元素存的值为"+arr[first][second]);
    }
}
//🌟🌟动态开辟二维数组（二维数组中一维数组的个数必须确认，但可以实现二维数组中一维数组的键入（row），每个一维数组中的元素个数可以动态开辟各不相同（键入line），）
class DynamicTwoDimensionalArray{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入二维数组的行数（一维数组的个数）");
        int row = myScanner.nextInt();
        int[][] arr;
        arr = new int[row][];
        int Num ;//接收每个一维数组中的各个元素值大小
        int line;
        for (int i = 0;i < arr.length;i++){
            System.out.println("请输入第"+(i+1)+"行一维数组的元素个数（开辟第"+(i+1)+"个一维数组的空间）");
            line = myScanner.nextInt();
            arr[i] = new int[line];
            for (int j = 0;j < line;++j){
                Num = myScanner.nextInt();
                arr[i][j] = Num;
            }
        }
        System.out.println("成功创建并键入二维数组如下：");
        int sum = 0;//统计二维数组中所有元素之和（tips：在外层初始化变量时，需要手动初始化为0）
        for (int i = 0;i < arr.length;++i){
            for (int j = 0;j < arr[i].length;++j){
                System.out.print(arr[i][j]+" ");
                sum += arr[i][j];
                if (i == arr.length-1 && j == arr[i].length-1) System.out.println("二维数组中所有元素之和为："+sum);
            }
            System.out.println();
        }
    }
}

class YangHuiTriangel{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入需要打印杨辉三角的排数");
        int row = myScanner.nextInt();
        int[][] arr = new int[row][];
//        arr[0] = new int[1];arr[1] = new int[2];
//        arr[0][0] = 1;arr[1][0] = 1;arr[1][1] = 1;
        for (int i = 0;i < arr.length;++i){
            arr[i] = new int[i+1];
            for (int j = 0;j < arr[i].length;++j){
                if (i == 0 || j == i || j == 0)arr[i][j] = 1;
                else arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
//        for (int i = 0;i < arr.length;++i){
//            for (int j = 0;j < arr[i].length;++j){
//
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
}

class Homework04{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入数组的长度");
        int length = myScanner.nextInt();
        int[] arr = new int[length];
        System.out.println("请输入" + arr.length + "个有序降序数字");
        for (int i = 0;i < arr.length;++i){
            arr[i] = myScanner.nextInt();
        }

        int[] arrNew = new int[arr.length + 1];
        System.out.println("请输入要插入的数字");
        int insert = myScanner.nextInt();
        int index = -1;///定义一个索引用来接收插入位置,
        for (int i = 0;i < arr.length;++i){/// 提前处理插入位置，找到了就可以直接在新的扩容数组中插入
            if (insert <= arr[i]){
                index = i;
                break;
            }
        }
        for (int i = 0, j = 0;i < arrNew.length;++i){
            if (i != index ){/// 点睛之笔，与前面的索引位置相同，则直接将原数组的元素复制给扩容数组
                arrNew[i] = arr[j];
                j++;
            }else arrNew[i] = insert;
        }
        arr = arrNew;
        for (int i = 0;i < arr.length;++i){
            System.out.print(arr[i]+" ");
        }
    }
}

class Homework05{
    public static void main(String[] args) {
        int[] arr = new int[10];
        double sum = 0;
        for (int i = 0;i < 10;++i){
            arr[i] = (int)(Math.random()*100+1);
            sum += arr[i];
        }
        System.out.println("随机生成容量为的数组为：");

        for (int i = arr.length - 1;i >= 0;--i){
            System.out.print(arr[i]+" ");
        }
    }
}