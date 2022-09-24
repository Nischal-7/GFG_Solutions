// https://practice.geeksforgeeks.org/problems/median-of-2-sorted-arrays-of-different-sizes/1?page=1&difficulty[]=2&status[]=solved&sortBy=latest




//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        int sum = n+m;
        int[] sol = new int[sum];
        int i=0,j=0,k=0;
        
        while(i<n && j<m){
            if(a[i]<b[j]){
                sol[k] = a[i];
                i++;
                k++;
            }
            else{
                sol[k] = b[j];
                j++;
                k++;
            }
        }
        if(i==n){
            while(j<m){
                sol[k] = b[j];
                j++;
                k++;
            }
        }
        else if(j == m){
            while(i<n){
                sol[k] = a[i];
                i++;
                k++;
            }
        }
        
        if(sum%2 == 1){
            return (double)sol[sum/2];
        }
        return (((double)sol[sum/2]+(double)sol[sum/2 - 1])/2);
    }
}
