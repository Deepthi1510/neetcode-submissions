class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> number=new HashSet<>();
        int b=0;
        for(int i=0;i<nums.length;i++){
            if(number.contains(nums[i])){
                
                return nums[i];
            }
            number.add(nums[i]);
        }
        return -1;
    }
}
