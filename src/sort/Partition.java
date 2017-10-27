package sort;

/**
 * Created by sugaryang on 2017/10/18.
 */
//快速排序算法：使左边的都小于，右边都大于
//序列中最小K个数为例。
public class Partition {
    //arr[] 数组，low数组第一个元素索引，high为最后一个元素的索引
    //http://www.cnblogs.com/luchen927/archive/2012/02/29/2368070.html
    public static void sort(int arr[], int left, int right) {

        if(left < right){
            int key = arr[left];
            int low = left;
            int high = right;
            while(low < high){
                // 从后往前找到一个比基数小的
                while(low < high && arr[high] > key){
                    high--;
                }
                arr[low] = arr[high];
                while(low < high && arr[low] < key){
                    low++;
                }
                arr[high] = arr[low];
            }
            arr[low] = key;
            sort(arr,left,low-1);
            sort(arr,low+1,right);

            System.out.println(arr);
        }
    }

    public static void main(String[] args) {
        int[] array={6,2,7,3,8,9};
        sort(array,0,5);
    }
}
