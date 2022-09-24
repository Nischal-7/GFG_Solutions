// https://practice.geeksforgeeks.org/problems/pattern/0




// User function Template for Java

class Solution {

    void printDiamond(int n) {
        // Your code here
        for(int i =0; i<n; i++){
            for(int j=n-1; j>i; j--)
                System.out.print(" ");
            for(int k=0; k<=i; k++)
                System.out.print("* ");
            System.out.println();
        }
        for(int i=0; i<n; i++){
            for(int j=1; j<=i; j++)
                System.out.print(" ");
            for(int k=i; k<n; k++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
