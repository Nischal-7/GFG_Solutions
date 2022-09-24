// https://practice.geeksforgeeks.org/problems/print-alternate-elements-of-an-array/0



//User function Template for Java

// arr[] is the array 
// n is the number of elements in array.
class GfG
{
    public static void print(int arr[], int n)
    {
        for(int i=0; i<n; i+=2)
            System.out.print(arr[i] +" ");
    }
}
