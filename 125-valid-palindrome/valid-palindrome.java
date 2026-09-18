class Solution {
    public boolean isPalindrome(String s) {
        String str=s;
        String reverse="";
        str=str.replaceAll("[^a-zA-Z0-9]","");
        str=str.toLowerCase();

        for(int i=str.length()-1;i>=0;i--){
            reverse=reverse + str.charAt(i);
        }
        if(str.equals(reverse)){
            return true;
        }
        else{
            return false;
        }

        
    }
}