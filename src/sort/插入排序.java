package sort;

/**
 * Created by sugaryang on 2017/10/18.
 */

//插入排序，给定有顺序的一组数组，让插入后。仍然是有序的
public class 插入排序 {

    public static int[] insert(int[] arr, int num) {
        //循环数组
        int len = arr.length;
        int[] a = new int[len + 1];
        for (int i = 0; i < arr.length; i++) { ////第0位独自作为有序数列，从第1位开始向后遍历
            {
                //换位
                if (num > arr[i]) {
                    a[i] = arr[i];

                } else {
                    for (int j = arr.length; j > i; j--) {
                        a[j] = arr[j - 1];
                    }
                    a[i] = num;
                    break;
                }
            }
            if (a[len] == 0) {
                a[len] = num;
            }
        }
        return a;

    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9};

        insert(arr, 10);
    }
}
