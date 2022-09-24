// https://practice.geeksforgeeks.org/problems/sum-of-series2811/0



// User function Template for Java

class Solution {
    // function to return sum of  1, 2, ... n
    long seriesSum(int n) {
        long m = n;
        long sum = m*(m+1)/2;
        return sum;
    }
}
