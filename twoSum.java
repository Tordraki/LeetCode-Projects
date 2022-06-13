import java.util.*;
public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        //brute force: check all combinations
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        return null;
        /*
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]+nums[j] == target){
                    int[] result = new int[]{i, j};
                    return result;
                }
            }
        }
        return new int[0];*/


        //sliding window wont work



    }
}
