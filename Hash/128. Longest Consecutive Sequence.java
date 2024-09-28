class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int maxL=0;
        for(int i=0;i<nums.length;i++){
            int curr = nums[i];
            if(set.contains(curr-1)){
                continue;
            }
            int count=1;
            while(set.contains(curr+1)){
                curr+=1;
                count++;
            }
            maxL = Math.max(maxL, count);
        }
        return maxL;
    }
}