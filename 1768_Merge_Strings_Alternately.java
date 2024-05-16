// solution 1 - 15ms

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


// solution 2 - 0ms

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1=word1.length(), len2=word2.length();

        int minL = (len1>len2)? len2:len1;
        
        StringBuilder str = new StringBuilder("");
        int i=0;
        for(;i<minL;i++){
            str.append(word1.charAt(i));
            str.append(word2.charAt(i));
        }

        if(minL==len1){
            str.append(word2.substring(i,len2));
        }
        else{
            str.append(word1.substring(i,len1));
        }

        return str.toString();
    }
}