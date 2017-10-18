package classic;

/**
 * Created by sugaryang on 2017/10/18.
 */

//直接插入排序:排序算法

public class Insert1 {
    public static void insert(int[] array) {
        for(int i=1;i<array.length;i++)//第0位独自作为有序数列，从第1位开始向后遍历
        {
            //如果后面的小于前面的
            if (array[i] < array[i - 1])//0~i-1位为有序，若第i位小于i-1位，继续寻位并插入，否则认为0~i位也是有序的，忽略此次循环，相当于continue
            {
                int temp = array[i];//保存第i位的值
                int k = i - 1;
                for (int j = k; j >= 0 && temp < array[j]; j--){//从第i-1位向前遍历并移位，直至找到小于第i位值停止
                    array[j + 1] = array[j];
                    k--;
                }
                array[k + 1] = temp;//插入第i位的值
            }
        }
        System.out.println(array);

    }

    public static void main(String[] args) {
        int[] a = {3, 1, 5, 7, 2, 4, 9, 6};

        insert(a);
    }


}
