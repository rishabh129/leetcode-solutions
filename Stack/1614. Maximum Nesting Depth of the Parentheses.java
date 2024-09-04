class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int depth=0;
        for(int i=0;i<s.length();i++){

            char curr=s.charAt(i);
            if(curr=='('){
                st.push(curr);
            }
            else if(curr==')'){
                depth = st.size()>depth?st.size():depth;
                st.pop();
            }
            else{
                continue;
            }

        }
        return depth;
    }
}