// https://practice.geeksforgeeks.org/problems/composite-and-prime0359/0




//User function Template for Java

class Solution
{
    public int Count(int L, int R)
    {
        if(L == R)
            return 1;
        if(L == 1)
            L++;
        int comp=0, prime=0;
        boolean flag;
        
        for(int i=L; i<=R; i++)
        {
            flag = true;
            for(int j=2; j*j<=i; j++)
            {
                if(i%j ==0)
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
                prime++;
            else
                comp++;
        }
        return comp-prime;
    }
}
