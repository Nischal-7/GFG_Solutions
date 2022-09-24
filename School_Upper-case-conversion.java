// https://practice.geeksforgeeks.org/problems/upper-case-conversion5419/0




//User function Template for Java

class Solution
{
    public String transform(String s)
    {
        char [] arr = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i<arr.length; i++)
        {
            if(i==0 || arr[i-1]==' ')
                sb.append(Character.toUpperCase(arr[i]));
            else
                sb.append(arr[i]);
        }
        String str = new String(sb);
        return str;
    }
}
