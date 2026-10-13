class Solution {
    public void duplicateZeros(int[] nums) {
        int s = 0 ;
        int os = 0;
        int[] ans = new int[nums.length];

        while(s < nums.length){
            if(nums[os] == 0){
                if(s < nums.length){
                    ans[s] = 0;
                }
                s += 1;
                if(s < nums.length){
                    ans[s] = 0;
                }
            }else{
                if(s < nums.length)
                ans[s] = nums[os];
            }
            s += 1;
            os += 1;
        }

        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = ans[i];
        }
    }
}