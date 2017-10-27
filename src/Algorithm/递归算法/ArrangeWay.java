package Algorithm.递归算法;

import static com.sun.tools.javac.jvm.ByteCodes.swap;

/**
 * Created by sugaryang on 2017/10/20.
 */
//找这个数组元素有几种排列方式
public class ArrangeWay {

    public static void perm(int[] array,int start){  //k为起始位置，n为数组大小
        int len=array.length;

            for(int i=start;i<len;i++){
                if(i==start || array[i]!=array[start]){
                    swap(array,i,start);
                    perm(array,start+1);
                    swap(array,i,start);
                }
        }
    }
    public static void swap(int[] chs,int i,int j)
    {
        int temp;
        temp=chs[i];
        chs[i]=chs[j];
        chs[j]=temp;
    }

    public static void main(String[] args) {
        int[] array={1,2,3};
        perm(array,0);
    }
}
