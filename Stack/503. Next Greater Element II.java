// using stack and queue

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int len = nums.length;
        int[] ans =new int[len];

        Stack<Integer> s = new Stack<>();
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<len;i++){
            q.add(nums[i]);
        }

        for(int i=len-1;i>=0;i--){

            while(!s.isEmpty() && s.peek()<=nums[i]){
                s.pop();
            }

            if(!s.isEmpty()){
                ans[i] = s.peek();
            }
            else{
                while(!q.isEmpty() && q.peek() <= nums[i]){
                    q.remove();
                }
                if(q.isEmpty()){
                    ans[i] = -1;
                }
                else{
                    ans[i] = q.peek();
                }
            }

            s.push(nums[i]);
        }
        return ans;
    }
}

// using only stack and circular array

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int len = nums.length;
        int[] ans =new int[len];

        Stack<Integer> s = new Stack<>();

        for(int i=(2*len)-1;i>=0;i--){

            while(!s.isEmpty() && s.peek()<=nums[i%len]){
                s.pop();
            }

            if(!s.isEmpty()){
                ans[i%len] = s.peek();
            }
            else{
                ans[i%len]=-1;
            }

            s.push(nums[i%len]);
        }
        return ans;
    }
}