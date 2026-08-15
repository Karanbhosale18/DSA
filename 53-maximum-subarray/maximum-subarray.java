class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum=0;
        int res=nums[0];

        for(int n : nums){
            // If the sum is negative set the sum = 0
            if(sum < 0){
                sum = 0;
            }
            // If the sum is greater than or equal to 0 add it in sum
            sum += n;
            // Find the maximum element between res and sum and stored it in res variable
            res = Math.max(res , sum);
        }
        return res;
    }
}