class Solution {
    public void reverseString(char[] s) {
        int a=0;
        int z=s.length-1;
        while(a<z){
            char temp=s[a];
            s[a]=s[z];
            s[z]=temp;
            a++;
            z--;
        }
    }
}