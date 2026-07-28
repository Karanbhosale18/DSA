class Solution {
    public int maxProduct(int[] nums) {
        
        int mx=0;
        int smx=0;
        for(int i=0; i<nums.length ; i++){
            int digit=nums[i];

            if(digit > mx){
                smx=mx;
                mx=digit;
            }else if(digit > smx){
                smx = digit;
            }
        }
        return ((mx-1)*(smx-1));

        /*
        Arrays.sort(nums);
        return ((nums[nums.length-1]-1)*(nums[nums.length-2]-1));
        */

        /*int res=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int op=(nums[i]-1)*(nums[j]-1);
                if(res < op){
                    res = op;
                }
            }
        }
        return res;
        */
    }

}