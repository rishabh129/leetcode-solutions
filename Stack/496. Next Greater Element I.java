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