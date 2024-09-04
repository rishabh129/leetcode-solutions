class Solution {
    int first(int[] nums, int target){

        int len = nums.length;
        int low = 0;
        int high = len-1;
        int ans=-1;

        while(low<=high){

            int mid = (low+high)/2;
            if(nums[mid]==target){
                ans=mid;
                high = mid-1;
            }
            else if(nums[mid] > target){
                high = mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return ans;
    }
    int last(int[] nums, int target){

        int len = nums.length;
        int low = 0;
        int high = len-1;
        int ans=-1;

        while(low<=high){

            int mid = (low+high)/2;
            if(nums[mid]==target){
                ans=mid;
                low = mid+1;
            }
            else if(nums[mid] > target){
                high = mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = first(nums, target);
        ans[1] = last(nums, target);
        return ans;
    }
}