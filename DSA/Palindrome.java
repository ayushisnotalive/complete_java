import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        String t = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i = 0,j = t.length()-1;
        while(i<j){
            if(t.charAt(i) != t.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}