class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int n : nums1){
            set1.add(n);
        }
        for(int n : nums2){
            set2.add(n);
        }

        int[] array = new int[(set1.size() > set2.size() ? set2.size() : set1.size())];
        int k=0;

        for(int n : (set1.size() > set2.size() ? set2 : set1)){
            if((set1.size() > set2.size() ? set1 : set2).contains(n)){
                array[k] = n;
                k++;
            }
        }
        return Arrays.copyOfRange(array,0,k);
    }
}