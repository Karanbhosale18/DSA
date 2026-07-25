class Solution {
    public int countOperations(int num1, int num2) {
        return helper(num1,num2,0);
    }

    public int helper(int n,int m,int c){

        if(n == 0 || m == 0){
            return c;
        }

        if(n > m){
           return helper(n-m , m , c+1);
        }
        return helper(n , m-n , c+1);
    }
}