class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        int i = 0;
        while(i < nums.length){
            if(nums[i] == 1){
                count ++;
            }else{
                count = 0;
            }
            if(max < count){
                max = count;
            }
            i++;
        }
        return max;
    }
}