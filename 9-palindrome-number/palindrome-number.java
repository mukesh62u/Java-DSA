class Solution {
    public boolean isPalindrome(int x) {
        int dup=x;
        int rev=0;
        while(x>0){
            int lg=x%10;
             rev=(rev*10)+lg;
             x=x/10;

        }
        if(rev==dup){
            return true;
        }
        else{
            return false;
        }
    }
}