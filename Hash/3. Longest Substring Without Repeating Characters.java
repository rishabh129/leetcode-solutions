class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxL=0, count=0;

        for(int i=0, j=0;i<s.length();i++){
            char curr=s.charAt(i);

            if(set.contains(curr)){
                while(set.contains(curr)){
                    set.remove(s.charAt(j));
                    j++;
                }
            }
            
            set.add(curr);
            count = i-j+1;
            maxL = Math.max(maxL, count);
            
        }
        return maxL;
    }
}