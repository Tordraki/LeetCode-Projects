public class productOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int sum = 1;
        int numZero = 0;
        for(int j: nums){
            if(j==0){
                numZero++;
            }
            else{
                sum*=j;
            }

        }
        int[] result = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==0){
                if(numZero>1){
                    result[i] = 0;
                }
                else{
                    result[i] = sum;
                }
            }
            else{
                if(numZero>0){
                    result[i] = 0;
                }
                else{
                    result[i] = sum/nums[i];
                }
            }

        }
        return result;
    }
}
