package classic;

/**
 * Created by sugaryang on 2017/10/18.
 */

//插入排序，给定有顺序的一组数组，让插入后。仍然是有序的
public class InsertSort {

    public static int[] insert(int[] arr,int num) {
        //循环数组
        for (int i = 1; i < arr.length; i++) {
            //换位
            if(arr[i]>5){


            }
            for (int j = i; j > 0; j--) {
                //判断最后一位如果大于第一位
                if (arr[j] < arr[i]) {

                    //交换顺序
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                } else {
                    break;
                }
            }
        }
        System.out.println(arr);
        return arr;


    }

    public static void main(String[] args) {
        int[] arr={1,4,6,9};
        int a=5;
        insert(arr,5);
    }
}
