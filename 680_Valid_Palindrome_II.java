class Solution {

    int palin(String st){
        int len = st.length();
        int idx=-1;

        for(int i=0;i<=len/2;i++){
            if(st.charAt(i)!=st.charAt(len-1-i)){
                return i;
            }
        }

        return idx;
    }

    public boolean validPalindrome(String s) {
        int len = s.length();
        int idx = palin(s);

        if(idx==-1)
        return true;


        String s1 = s.substring(0,idx) + s.substring(idx+1);
        String s2 = s.substring(0,len-idx-1) + s.substring(len-idx);

       idx = palin(s1);

        if(idx==-1)
        return true;

        idx = palin(s2);

        if(idx==-1)
        return true;

        return false;
    }
}