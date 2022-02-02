import java.util.*;

public class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int a:nums){
            if(map.containsKey(a)){
                return true;
            }
            else{
                map.put(a, 1);
            }
        }
        return false;
    }
}
