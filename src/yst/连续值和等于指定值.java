package yst;
import java.util.*;
/**
 * Created by sugaryang on 2017/10/18.
 */

//给定数组，找到连续值和等于给定值
public class 连续值和等于指定值 {

        public static int subarraySum(int[] nums, int k) {
            int sum = 0;
            int num = 0;        //等于固定值的个数
            Map<Integer, Integer> map = new HashMap<>();
            //判断数组是否等0
            if (nums != null && nums.length > 0) {
                //数组长度大于0
                for (int i = 0; i < nums.length; i++) {
                    sum = sum + nums[i];
                    if (sum == k) {
                        num = num + 1;
                    }
                    int temp = sum - k;
                    //如果包含相加等于这个值得
                    if (map.containsKey(temp)) {
                        num = num + map.get(temp);
                    }
                    //不包含，查一下这个求和的是否有，有的话值姐value+1
                    if (map.containsKey(sum)) {
                        map.put(sum, map.get(sum) + 1);
                    } else {
                        map.put(sum, 1);
                    }
                }
            }
            return num;
        }

        public static void main(String[] args) {
            int k = 0;          //固定值
            int[] array = {0, 0, 0, 0, 0, 0, 0};
            System.out.println(subarraySum(array, k));
        }


}
