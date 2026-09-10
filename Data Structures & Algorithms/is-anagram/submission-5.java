class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] ssorted=s.toCharArray();
        char[] tsorted=t.toCharArray();
        Arrays.sort(ssorted);
        Arrays.sort(tsorted);
        for(int i=0;i<s.length();i++){
            if(ssorted[i]==tsorted[i]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
