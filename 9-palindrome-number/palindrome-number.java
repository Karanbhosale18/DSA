class Solution {
    public boolean isPalindrome(int x) {
        
        String no=String.valueOf(x);
        int p1=0;
        int p2=no.length()-1;

        if(p2==0){
            return true;
        }else{
        for(int i=0;i<no.length()/2;i++){
            if(no.charAt(p1)!=no.charAt(p2)){
                return false;
            }
            p1++;
            p2--;
        }
        return true;
        }
    }
}