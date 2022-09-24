// https://practice.geeksforgeeks.org/problems/average4856/0




//User function Template for Java

class Solution {
    float[] streamAvg(int[] arr, int n) {
        float sum = (float)arr[0];
        float[] stream = new float[n];
        stream[0] = sum;
        for(int i=1; i<n; i++)
        {
            sum += (float)arr[i];
            stream[i] = sum/(i+1);
            
        }
        return stream;
    }
}
