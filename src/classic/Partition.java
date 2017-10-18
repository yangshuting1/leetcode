package classic;

/**
 * Created by sugaryang on 2017/10/18.
 */
//快速排序算法：使左边的都小于，右边都大于
//序列中最小K个数为例。
public class Partition {
    //arr[] 数组，low数组第一个元素索引，high为最后一个元素的索引

    public void sort(int arr[],int low,int high){
       int l=low;
       int h=high;
       int p = arr[low];  //基准数

        while(l<h){
            while(arr[h]>=p && h>l){//循环结束的条件有：1.找到比支点更小的。2 l==h
                h--;
            }
            if(l<h){  //由于上面循环结束的功能有两个，找到比支点小的数，即j!=i，要进行位置的交换，下同
                 arr[l]=arr[h];
            }
            while(arr[l]<p && l<h){
                   l++;
            }
            if(l<h){
                arr[h] = arr[l];

                h--;
            }
        }
        arr[l]=p;

    }
}
