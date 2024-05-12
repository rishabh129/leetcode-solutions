// Trailing zeros are zeros from the right of the binary representation of a number. Write a function that determines if a given integer has trailing zeros in its binary representation.

// 2 nums will have trailing zeros only if they are even. So, we can check if the number of even numbers is greater than or equal to 2. If it is, return true, else return false.
class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int count=0;

        for(int i=0;i<nums.length;i++){
            if((nums[i]&1)==0)
                count++;
            if(count==2)
            return true;
        }
        return false;
    }
}