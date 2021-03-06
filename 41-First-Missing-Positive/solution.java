public class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums==null){
            return 1;
        }
        for(int i=0; i<nums.length; i++){
            while(nums[i]>0&&nums[i]<=nums.length&&nums[i]!=i+1){
                int temp = nums[nums[i]-1];
                if(nums[i]==nums[nums[i]-1]){
                    break;
                }
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }
}