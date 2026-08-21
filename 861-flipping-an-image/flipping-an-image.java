class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        for(int[] nums: image){
            for(int i=0; i < (image[0].length + 1)/2;i++){

                int temp = nums[i] ^ 1;
                nums[i] = nums[(image[0].length-i-1)] ^ 1;
                nums[(image[0].length-i-1)] = temp;

            }
        }
        return image;
    }
}