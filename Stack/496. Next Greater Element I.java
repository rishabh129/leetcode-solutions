class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int maxS=-1;
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]>maxS){
                maxS=nums2[i];
            }
        }

        int[] next = new int[maxS+1];
        int p=0;

        Stack<Integer> s = new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek() <= nums2[i]){
                s.pop();
            }
            if(s.isEmpty()){
                next[nums2[i]] = -1;
            }
            else{
                next[nums2[i]] = s.peek();
            }
            s.push(nums2[i]);
        }
         
        int[] ans = new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            ans[i] = next[nums1[i]];
        }
        return ans;
    }
}

// using hashmap & stack

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> next = new HashMap<>();

        Stack<Integer> stack = new Stack<>();

        int size = nums2.length-1;
        for(int i=size;i>=0;i--){

            while(!stack.isEmpty() && stack.peek() < nums2[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                next.put(nums2[i],stack.peek());
            }
            else{
                next.put(nums2[i],-1);
            }
            
            stack.push(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++){
            nums1[i] = next.get(nums1[i]);
        }
        return nums1;
    }
}