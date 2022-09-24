// https://practice.geeksforgeeks.org/problems/java-convert-string-to-lowercase2313/0



// User function template for Java

class Solution {
    static String toLower(String S) {
        char [] arr = S.toCharArray();
        char temp;
        for(int i=0; i<arr.length; i++){
            temp = arr[i];
            arr[i] = Character.toLowerCase(temp);
        }
            // arr[i] = arr[i].toLowerCase;
        String s = new String(arr);
        return s;
    }
}
