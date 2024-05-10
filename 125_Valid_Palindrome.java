class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String newString = "";

        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if((curr>='a' && curr<='z') || (curr>='0' && curr<='9'))
            newString+=curr;
        }

        for(int i=0;i<newString.length()/2;i++){
            if(newString.charAt(i)!=newString.charAt(newString.length() - 1 - i))
            return false;
        }
        return true;
    }
}