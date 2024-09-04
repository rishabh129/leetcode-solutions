class Solution {
    public boolean rotateString(String s, String goal) {
        if(goal.length() != s.length()){
            return false;
        }
        goal+=goal;

        if(goal.contains(s)){
            return true;
        }
        return false;
    }
}