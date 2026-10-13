class Solution {
    public void duplicateZeros(int[] nums) {
        /*
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
        } */

        int[] neww = nums.clone();
        int i =0;
        int j = 0;

        while(i < nums.length){
            nums[i] = neww[j];
            if(neww[j] == 0 && i+1 < nums.length){
                i += 1;
                nums[i] = 0;
            }
            i += 1;
            j += 1;
        }
    }
}