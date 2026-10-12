class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sqrt = new int[nums.length];

        int s = 0, e = nums.length-1 ,end = nums.length-1;

        while(s <= e){
            if((nums[s] * nums[s]) < (nums[e] * nums[e])){
                sqrt[end] = nums[e] * nums[e];
                e --;
            }else{
                sqrt[end] = nums[s] * nums[s];
                s++;
            }
            end -- ;
        }
        return sqrt;
    }
}