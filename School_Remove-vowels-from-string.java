// https://practice.geeksforgeeks.org/problems/remove-vowels-from-string1446/0



//User function Template for Java

class Solution {
    String removeVowels(String S) {
        char [] arr = S.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')
                continue;
            sb.append(arr[i]);
        }
        String str = new String(sb);
        return str;
    }
}
