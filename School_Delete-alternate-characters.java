// https://practice.geeksforgeeks.org/problems/java-delete-alternate-characters4036/0




// User function template for Java

class Solution {
    static String delAlternate(String S) {
        char [] arr = S.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i<arr.length; i+=2)
            sb.append(arr[i]);
        String str = new String(sb);
        return str;
    }
}
