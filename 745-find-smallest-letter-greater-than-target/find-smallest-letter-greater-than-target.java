class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int start=0;
        int end=letters.length-1;

        while(end>=start){
            int mid=start+(end-start)/2;

            if(target < letters[mid]){
                end=mid-1;
            }else{
                //if(target > letters[mid])
                start=mid+1;
            }
        }
        return letters[start % letters.length];
        /*Problem statement state that if char not found it must return 0 indexed char

        It used because suppose a test case is : 
            letters = ["x","x","y","y"], target = "z"
            
            in 1st Iteration: 3>=0 true
                start=0,end=3 and mid=1   hence x<z (true) then start=mid+1, now start=2

            in 2st Iteration:  3>=2 true
                start=2,end=3 and mid=2   hence x<z (true) then start=mid+1, now start=3
                
            in 3st Iteration:  3>=3 true
                start=3,end=3 and mid=3   hence x<z (true) then start=mid+1, now start=4

            in 3st Iteration:  3>=4 false 
            
            it return(start % letters.length)  --> (4%4 = 0)
            

            Suppose in this test case letters = ["c","f","j"], target = "c"
            it return start =1
            so return(start % letters.length)  -->(1%3 = 1) return char at 1 
            */
    }
}