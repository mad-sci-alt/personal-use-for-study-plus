package arrays_;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author 张 书航
 */
public class DefinedSort {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("请输入数组的大小");
        int length = myScanner.nextInt();
        int[] arr = new int[length];
        arraysInput(length, arr);
        System.out.println("排序后的数组为：" + definedBubbleSort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer) o1;
                int i2 = (Integer) o2;
                return i2 - i1;
            }
        }));
    }

    public static void arraysInput(int length, int[] arr) {
        System.out.println("请输入" + length + "个整数");
        for (int i = 0; i < length; i++) {
            arr[i] = myScanner.nextInt();
        }
    }

    public static String definedBubbleSort(int[] arr, Comparator c) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return Arrays.toString(arr);
    }

}

