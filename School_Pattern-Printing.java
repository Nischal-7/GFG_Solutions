// https://practice.geeksforgeeks.org/problems/pattern-printing1347/0



//User function Template for Java
class Solution{
    static void printPattern(int N){
        for(int i=0; i<N; i++)
        {
            for(int j=0; j<=i; j++)
                System.out.print("*");
            System.out.print(" ");
        }
    }
}
