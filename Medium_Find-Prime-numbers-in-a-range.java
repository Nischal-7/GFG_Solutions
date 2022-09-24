// https://practice.geeksforgeeks.org/problems/find-prime-numbers-in-a-range4718/0




// User function Template for Java

class Solution {
    ArrayList<Integer> primeRange(int M, int N) {
        // code here
        boolean flag;
        ArrayList<Integer> aL = new ArrayList<Integer> ();
        if(M==1)
            M++;
        for(int i = M; i<=N; i++)
        {
            flag = true;
            for(int j=2; j*j<=i; j++)
            {
                if(i%j==0){
                    flag = false;
                    break;
                }
                    
            }
            if(flag)
                aL.add(i);
        }
        return aL;
    }
}
