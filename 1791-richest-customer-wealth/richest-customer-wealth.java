class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth=0;
        for (int person=0; person < accounts.length; person++){
            int currentWealth=0;
            for(int account=0; account < accounts[person].length; account++){
                currentWealth += accounts[person][account];
            }
            if(currentWealth > maxWealth){
                    maxWealth=currentWealth; 
                }
        }
        return maxWealth;
    }
}