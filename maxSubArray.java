public class maxSubArray {
    public int maxSubArray(int[] nums) {
        int current = 0;
        int max = nums[0];
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>0){
                current += nums[i];
                if(current>max){
                    max = current;
                }
            }else{
                if(current+nums[i]<=0){
                    current = 0;
                    if(max<nums[i]){
                        max = nums[i];
                    }
                }
                else{
                    current+=nums[i];
                }
            }

        }
        return max;

    }
}
