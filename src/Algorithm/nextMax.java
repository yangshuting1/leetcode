package Algorithm;

/**
 * Created by sugaryang on 2017/10/20.
 */
//求次大或次小
    //要求，不要修改原来数组的结果，不要使用排序，使用两个临时变量存放最大(小)，次大（小）的数，
// 一趟循环下来通过循环变量和临时变量中的数据进行比较。保存三个数中最大(小)，次大（小）的

public class nextMax {

    public static int nextM(int[] array){
        int max=0;
        int next=0;

        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                next = max;
                max=array[i];
            }else if(array[i]>next){
                next = array[i];
            }
        }
        return next;
    }

    public static void main(String[] args) {
        int[] array={1,5,9,3,18,2,6,4,7};
        nextM(array);
    }


}
