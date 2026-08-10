class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int maximum=0;
        int num=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            int val=map.get(nums[i]);
            if(val>maximum){
                maximum=val;
                num=nums[i];
            }
        }
        return num;
    }
}