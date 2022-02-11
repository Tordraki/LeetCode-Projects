import java.util.*;
public class diffPairsInArray {
    class Solution {
        public int findPairs(int[] nums, int k) {
            return mapSearch(nums, k);
        }

        public int mapSearch(int[] nums, int k){
            int count = 0;
            Map<Integer, Integer> map = new TreeMap<>();
            for(int n: nums){
                map.put(n, map.getOrDefault(n, 0)+1);
            }
            for(int j: map.keySet()){
                if((map.containsKey(j+k)&&k!=0) || (k==0 && map.get(j)>1)){
                    count++;
                }
            }
            return count;
        }

        public int fasterArray(int[]nums, int k){
            nums = nums.clone();

            Arrays.sort(nums);

            int count = 0;
            int temp = -100;

            for(int i = 0; i< nums.length; i++){
                if(temp != nums[i]){
                    for(int j = i+1; j<nums.length; j++){
                        if(nums[j]-nums[i]==k){
                            count++;
                            j = nums.length;
                        }
                    }
                    temp = nums[i];
                }


            }
            return count;
        }

        public int bruteForce(int[] nums, int k){
            int count = 0;
            Map<Integer, Integer> m1 = new TreeMap<>();
            for(int i = 0; i<nums.length-1; i++){
                for(int j = i+1; j<nums.length; j++){
                    if(Math.abs(nums[i]-nums[j])==k){
                        if(nums[i]<nums[j]){
                            if(!m1.containsKey(nums[i])){
                                m1.put(nums[i], nums[j]);
                                count++;
                            }
                        }
                        else if(nums[i] > nums[j]){
                            if(!m1.containsKey(nums[j])){
                                m1.put(nums[j], nums[i]);
                                count++;
                            }
                        }
                        else{
                            if(!m1.containsKey(nums[i])){
                                m1.put(nums[i], nums[j]);
                                count++;
                            }
                        }
                    }
                }
            }
            return count;
        }
    }
}
