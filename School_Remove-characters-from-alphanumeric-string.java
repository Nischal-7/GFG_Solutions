// https://practice.geeksforgeeks.org/problems/remove-characters-from-alphanumeric-string0648/0




//User function Template for Java

class Solution {
    String removeCharacters(String S) {
        char [] arr = S.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]>='0' && arr[i]<='9')
                sb.append(arr[i]);
        }
        String str = new String(sb);
        return str;
    }
}
