class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxsum=nums[0];
        for(int st=0;st<nums.length;st++){
            int currentsum=0;
            for(int end=st;end<nums.length;end++){
                currentsum+=nums[end];
                maxsum=Math.max(currentsum,maxsum);
            }
        }
        return maxsum;
    }
}
