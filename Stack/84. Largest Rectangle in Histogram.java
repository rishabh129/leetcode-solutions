class Solution {
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        
        int[] nsr = new int[len];
        int[] nsl = new int[len];
    
        Stack<Integer> s = new Stack<>();

        for(int i=len-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = len;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        while(!s.isEmpty()){
            s.pop();
        }

        for(int i=0;i<len;i++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        int max = 0;
        for(int i=0;i<len;i++){
            int curr = heights[i] * (nsr[i]-nsl[i]-1);
            max = (curr>max)?curr:max;
        }
        return max;
    }
}