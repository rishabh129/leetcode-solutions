class Solution {
    public int minimumLength(String s) {
        int count[] = new int[26];

        for(int i=0;i<26;i++){
            count[i] = 0;
        }

        for(int i=0;i<s.length();i++){

            count[s.charAt(i) - 'a']++;

        }

        int c=0;

        for(int i=0;i<26;i++){
            if(count[i]>=3){
                if(count[i]%2==0){
                    c+=2;
                }
                else{
                    c+=1;
                }
            }
            else{
                c+=count[i];
            }
        }
        return c;
    }
}