public class maxSubArray2 {
    public int maxSubArray2(int[] nums) {
        int curr = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            int c = nums[i];
            curr = Math.max(c, curr+c);
            max = Math.max(max, curr);
        }
        return max;
    }
}
