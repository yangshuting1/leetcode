package yst;

/**
 * Created by sugaryang on 2017/10/21.
 */

//原来数组是有序的，然后给定一个字去查，是否在数组中
public class 二分查找 {

    public int binarySearch(int[] array,int des){
        //定义初识最小
        int low=0;
        //最大索引
        int high = array.length-1;
        //确保不会重复查找
        if(low<=high && low<=array.length-1 && high<=array.length-1){
            //计算出中间索引
            int middle=(high+low)/2;
            if(des==array[middle]){
                return middle;
            }else if(des<array[middle]){
                high= middle-1;
            }else{
                low = middle+1;
            }
        }
          return -1;
    }

}
