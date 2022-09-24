// https://practice.geeksforgeeks.org/problems/value-equal-to-index-value1330/0



//User function Template for Java


class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        for(int i=0; i<n; i++)
        {
            if(arr[i]==i+1)
                al.add(arr[i]);
        }
        return al;
    }
}
