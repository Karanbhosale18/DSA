class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){

            /*if(Integer.toString(nums[i]).length() % 2 == 0){
                count ++;
            }*/

            if(checkEven(nums[i])){
                count ++;
            }
        }
        return count;
    }

    public boolean checkEven(int a){
        int c = 0;
        while(a != 0){
            a = a / 10;
            c ++;
        }
        if(c % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}