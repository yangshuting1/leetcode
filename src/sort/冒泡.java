package sort;

/**
 * Created by sugaryang on 2017/10/18.
 */
//冒泡算法：一次比较两个元素，如果他们的顺序错误就把他们交换过来
// 从左到右依次增大
public class 冒泡 {

    public static void sort(int[] a){

        for(int i = 0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

    }

    //求取数组中，最小的n个数
    public static void main(String[] args) {
        int[] array={1,5,3,9,4,9,28,29};
        sort(array) ;
    }

}
