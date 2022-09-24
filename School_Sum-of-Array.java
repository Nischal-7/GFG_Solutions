// https://practice.geeksforgeeks.org/problems/sum-of-array2326/0




// User function Template for Java

class Solution {
    int sum(int arr[], int n) {
        int sum = 0;
        for(int i = 0; i<n; i++)
            sum += arr[i];
        return sum;
    }
}
