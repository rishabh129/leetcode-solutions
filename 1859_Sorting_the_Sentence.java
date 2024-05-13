class Solution {
    public String sortSentence(String s) {
        String arr[] = new String[10];
        int prev=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==' '){
                arr[s.charAt(i-1)-48] = s.substring(prev,i-1);
                prev=i+1;
            }
        }
        arr[s.charAt(s.length()-1)-48] = s.substring(prev,s.length()-1);
        StringBuilder str = new StringBuilder("");
        for(int i=1;i<arr.length;i++){
            if(arr[i]==null)
            break;
            str.append(arr[i]+" ");
            
        }
        return str.toString().trim();
    }
}