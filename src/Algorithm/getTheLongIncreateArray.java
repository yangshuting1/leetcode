package Algorithm;

/**
 * Created by sugaryang on 2017/10/20.
 */

//求已知数组的最大递归子串长度
public class getTheLongIncreateArray {

    public static int getIncreate(int[] array){
         int[] lens=new int[array.length];
         for(int i=0;i<array.length;i++){
             lens[i]=1;
             for(int j=0;j<i;j++){
                 if(array[j]<array[i] && lens[j]>lens[i]-1){
                     lens[i]=lens[j]+1;
                 }
             }
         }
        return lens[lens.length-1]；
    }


    public static void main(String[] args) {
    }
}
