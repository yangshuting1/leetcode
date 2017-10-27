package Algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sugaryang on 2017/10/20.
 */

//有一个无序数组，如 a{1,5,3,9}，按照要求排名，第一名 输出冠军，第二名输出亚军，第三名输出季军，第四名及以后 输出排序名次，


    //思路：新建数组，进行排序
public class test {

    public static String[] test1(int[] array){
        int len=array.length;
        String[] arr=new String[len];
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<len;i++){           //进行排序
            for(int j=i;j<len;j++){
                if(array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        for(int i=0;i<len;i++){
            map.put(array[i],i);
        }

        //排序过后，查一下
        for(int i=0;i<len;i++){
            if(map.get(array[i])==0){
                arr[i]="冠军";
            }else if(map.get(array[i])==1){
                arr[i]="亚军";
            }else if(map.get(array[i])==2){
                arr[i]="季军";
            }else{
                arr[i]="第"+String.valueOf(i+1)+"名";
            }
        }

        System.out.println(arr);
        return arr;


    }

    public static void main(String[] args) {
        int[] array={1,5,3,9,4,9,28,29};
        test1(array);
    }
}
