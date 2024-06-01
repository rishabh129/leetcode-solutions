    class Solution {
        public int scoreOfString(String s) {
            int sum=0;
            for(int i=0;i<s.length()-1;i++){
                char curr = s.charAt(i);
                char next = s.charAt(i+1);

                sum += (int) (curr>next?curr-next:next-curr);
            }
            return sum;
            
        }
    }