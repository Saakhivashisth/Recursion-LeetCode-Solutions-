class Solution {
    public static void reverseStringChar(char[]s,int start,int end){
        //base case
        if(start>=end){
            return;
        }
        //swap function
        char temp=s[start];
        s[start]=s[end];
        s[end]=temp;

        reverseStringChar(s,start+1,end-1);
    } 
    public void reverseString(char[] s) {
        reverseStringChar(s,0,s.length-1);
    }
}