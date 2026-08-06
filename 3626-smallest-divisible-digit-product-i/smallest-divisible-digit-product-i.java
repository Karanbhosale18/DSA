class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            int product = 1;
            int no = n;
            while (no > 0) {
                product *= no % 10;
                no /= 10;
            }
            if (product % t == 0) {
                return n;
            }
            n++;
        }
    }
}
