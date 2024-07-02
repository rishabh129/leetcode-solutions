// log base 10 of a number gives the number of digits in that number -1 
// so all even becomes odd and all odd becomes even, count the number of odd digits

class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
           if(((int) Math.log10(nums[i]) & 1) == 1 )
           count++;
        }
        return count;
    }
}

