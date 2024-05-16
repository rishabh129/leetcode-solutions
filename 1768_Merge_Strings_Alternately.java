class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0,len1=word1.length(), len2=word2.length();
        boolean odd=true;
        StringBuilder str = new StringBuilder("");
        while(i<len1 && j<len2){
            if(odd){
                str.append(word1.charAt(i));
                i++;
                odd=false;
            }
            else{
                str.append(word2.charAt(j));
                j++;
                odd=true;
            }
        }

        while(i<len1){
            str.append(word1.charAt(i));
            i++;
        }
        while(j<len2){
            str.append(word2.charAt(j));
            j++;
        }

        return str.toString();
    }
}