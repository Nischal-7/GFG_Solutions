// https://practice.geeksforgeeks.org/problems/java-reverse-a-string0416/0



class Solution {
    static String revStr(String S) {
        char []arr = S.toCharArray();
        char temp;
        if(S.length()%2 == 0)
        {
            for(int i=0; i<S.length()/2; i++)
        {
            temp = arr[i];
            arr[i] = arr[S.length()-i-1];
            arr[S.length()-i-1] = temp;
        }
        }
        else
        {
            for(int i=0; i<=S.length()/2; i++)
        {
            temp = arr[i];
            arr[i] = arr[S.length()-i-1];
            arr[S.length()-i-1] = temp;
        }
        }
        String str = new String(arr);
        return str;
    }
}
