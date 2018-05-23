package map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yangshuting
 */
public class SubarraySumEquals {

    public static int subarraySum(int[] nums, int k) {
        int sum = 0;
        int num = 0;        //等于固定值的个数
        Map<Integer, Integer> map = new HashMap<>();
        if (nums != null && nums.length > 0) {
            //数组长度大于0
            for (int i = 0; i < nums.length; i++) {
                sum = sum + nums[i];
                if (sum == k) {
                    num = num + 1;
                }
                int temp = sum - k;
                if (map.containsKey(temp)) {
                    num = num + map.get(temp);
                }
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
