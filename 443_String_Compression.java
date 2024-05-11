class Solution {
    public int compress(char[] chars) {
        if(chars.length == 1)
        return 1;
        StringBuilder str = new StringBuilder("");
        char curr=' ', prev=' ';
        int count=1;
        for(int i=1;i<chars.length;i++){
            curr = chars[i];
            prev = chars[i-1];
            if(curr==prev){
                count++;
            }
            else{
                if(count!=1)
                str.append(prev+""+count);
                else
                str.append(prev);
                count=1;
            }
        }
        if(count!=1)
                str.append(curr+""+count);
                else
                str.append(curr);
        
        for(int i=0;i<str.length();i++){
            chars[i] = str.charAt(i);
        }
        return str.length();
    }
}