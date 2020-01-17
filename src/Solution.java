import java.util.*;
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int dif = target - nums[i];
            if (map.get(dif) != null) {
                res[0] = map.get(dif);
                res[1] = i;
                return res;
            }
            //只有一对结果，即便两个数字相等，也是一个存入map，一个在手上拿着比较，不会被覆盖
            map.put(nums[i],i);
        }
        return res;
    }
}
