import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int l=0,r=0;
        r=nums.length-1;
        HashMap<Integer,Integer> prevMap = new HashMap<>();
        for(int i=0;i<=r;i++)
        {
            int complement = target - nums[i];
            if (prevMap.containsKey(complement)) 
            {
                return new int[]{i,prevMap.get(complement)};
            }
            prevMap.put(nums[i],i);
        }
        return null;
    }
        
}