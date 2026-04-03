class Solution {
    public char kthCharacter(int k) {
        return solve(k);
    }
        private char solve(int k){
       if(k==1) return 'a';
       int len=1;
       while(k>len){
       len=len*2;
       }
       int mid=len/2;
       if(mid>=k){
        return solve(k);
       }else{
        char ch=solve(k-mid);
        return (char)((ch-'a'+1)%26+'a');
       }
    }
    
}