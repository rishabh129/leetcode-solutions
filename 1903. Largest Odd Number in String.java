class Solution {
    public String largestOddNumber(String num) {
        int len = num.length();

        for(int i=len-1;i>=0;i--){

            char curr = num.charAt(i);
            if(curr == '1' || curr=='3'||curr=='5'||curr=='7'||curr=='9'){
                return num.substring(0,i+1);
            }

        }
        return "";
    }
}