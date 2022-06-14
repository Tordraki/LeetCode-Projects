public class search {
    public int search(int[] nums, int target) {
        int min = 0; int max = nums.length -1; int pivot = (min+max)/2;
        while(min <= max){
            if(nums[pivot] == target){
                return pivot;
            }
            else if(nums[pivot]>target){
                max = pivot-1;
            }
            else if(nums[pivot]<target){
                min = pivot+1;
            }
            pivot = (min+max)/2;
        }
        return -1;

    }
}
