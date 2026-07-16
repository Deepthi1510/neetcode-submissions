class Solution {
    public int removeElement(int[] nums, int val) {
        int[] expectedNums= new int[nums.length];
        int k=0;
        // think like ehich number to keep, not like which number to remove
        // override the elements.
        // return k
        // we are returning k, that is nothing but returning the elemnts till where we keep numbers.
        // k represents the number of elements we kept.
        // The first k elements of nums are the answer.
        for(int i=0;i<nums.length;i++){
            if(val!=nums[i]){
                nums[k]=nums[i];
                k++;
            }    
        }
        return k;
    }
}