class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph=paragraph.toLowerCase();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<paragraph.length();i++){
            char ch=paragraph.charAt(i);
            if(ch>='a' && ch<='z'){
                str.append(ch);
            }
            else if(!str.toString().endsWith(" ")){
                str.append(' ');
            }
        }
        paragraph=str.toString();

        String[] para = paragraph.split(" ");
        Set<String> ban = new HashSet<>();

        HashMap<String, Integer> freq = new HashMap<>();

        for(String word:banned){
            ban.add(word);
        }
        for(String word:para){
            if(ban.contains(word)){
                continue;
            }

            if(freq.containsKey(word)){
                int count=freq.get(word);
                freq.put(word,count+1);
            }
            else{
                freq.put(word,1);
            }
        }

        Set<String> keys = freq.keySet();

        int maxFreq=0;
        String ans="";
        for(String key:keys){
            System.out.println(key+" "+freq.get(key));
            if(freq.get(key)>maxFreq){
                ans=key;
                maxFreq=freq.get(key);
            }
        }
        return ans;
    }
}