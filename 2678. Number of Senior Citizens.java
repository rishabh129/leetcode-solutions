class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String p:details){

            char age = p.charAt(11);

            if(age == '6' && p.charAt(12)>'0'){
                count++;
            }

            if(age >'6'){
                count++;
            }

        }
        return count;
    }
}