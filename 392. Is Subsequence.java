class Solution {
    public boolean isSubsequence(String s, String t) {
        int right=0;

        if(t.length()<s.length()){
            return false;
        }

        for(int i=0;i<s.length();i++, right++){
            if(right==t.length()){
                    return false;
                }
            while(t.charAt(right) != s.charAt(i)){
                right++;
                if(right==t.length()){
                    return false;
                }
            }
        }
        return true;
    }
}