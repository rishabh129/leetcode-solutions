class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length-1];

        int len = first.length()>last.length()?last.length():first.length();
        String ans="";

        for(int i=0;i<len;i++){

            if(first.charAt(i)!=last.charAt(i)){
                return ans;
            }
            ans+=first.charAt(i);
        }
        return ans;



    }
}