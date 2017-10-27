package yst;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sugaryang on 2017/10/16.
 */
//数组中有两个数的和等于指定的数，把那两个数找出来
public class 找两数等于指定数 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] returnList = new int[2];
        for (int i = 0; i < nums.length; i++) {
            //这个key存在
            if (map.containsKey(target - nums[i])) {
                int[] t = {map.get(target - nums[i]), i};
                returnList = t;
            } else {
                map.put(nums[i], i);
            }

        }
        return returnList;
    }


    public void main(String[] args) {
        int[] nums = {3, 2, 4};
        twoSum(nums, 6);
    }


}
