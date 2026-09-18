class Solution {
    public int reverse(int x) {

       int reverse=0;
        int dup=x;
        x=Math.abs(x);
        
        while(x>0){
            int lg=x%10;
            if(reverse>Integer.MAX_VALUE/10 || reverse<Integer.MIN_VALUE/10){
                return 0;
            }
            reverse=(reverse*10)+lg;
            x=x/10;
        }
        if(dup<0){
            return -reverse;
        }
        else{
            return reverse;

        }
        

        
    }
}