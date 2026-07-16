class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        int str= 0;
        int end= s.length()-1;
        while(str<end){
            if(s.charAt(str)==(s.charAt(end))){
                str++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;

    }
}
