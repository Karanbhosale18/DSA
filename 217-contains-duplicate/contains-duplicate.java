class Solution {
    public boolean containsDuplicate(int[] nums) {

        /*Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;*/


        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            if(set.contains(n)){
                return true;
            }
            set.add(n);
        }
        return false;


        /* Only 72 test cases are running
        Map<Integer,Integer> map =new HashMap<>();
        for(int n : nums){
            if(!map.containsKey(n)){
                map.put(n,0);
            }
            map.put(n,map.get(n)+1);
        }
        for(int n : nums){
            if(map.get(n) == 2){
                return true;
            }
        }
        return false;*/
    }
}