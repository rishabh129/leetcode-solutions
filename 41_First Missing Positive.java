class Solution {
    public int firstMissingPositive(int[] nums) {

        boolean[] flag=new boolean[nums.length];

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0 && nums[i]<=nums.length)
            flag[nums[i]-1]=true;
        }
        for(int i=0;i<flag.length;i++){
            if(flag[i]==false)
            return i+1;
        }
        return nums.length+1;
    
    }
}