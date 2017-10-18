package classic;

/**
 * Created by sugaryang on 2017/10/18.
 */
//冒泡算法：一次比较两个元素，如果他们的顺序错误就把他们交换过来
// 从左到右依次增大
public class classic {

    public void sort(int[] a){
        int temp = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i+1]<a[i]){
                temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }

        }
    }

    //求取数组中，最小的n个数

}
