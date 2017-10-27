package yst;

/**
 * Created by sugaryang on 2017/10/21.
 */
//获取最长递归子序列
public class 最长递归增长长度 {

    public int getIncreateLength(int[] array){
        int[] len=new int[array.length];
        for(int i =0;i<array.length;i++){
            len[i]=1;
            for(int j=0;j<i;j++){
                if(array[j]<array[i] && len[j]>(len[i]-1)){
                    len[i]=len[j]+1;
                }
            }
        }
        int length=len.length-1;
        return len[length];         //数组最后一个的值
    }
}
