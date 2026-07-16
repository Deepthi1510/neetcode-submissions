class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seenum= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!seenum.add(nums[i])){
                return true;
            }
           
        }
       return false; 
    }
}