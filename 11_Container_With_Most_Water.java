class Solution {
    public int maxArea(int[] ar) {
         int left = 0, right =ar.length-1;
        int maxArea = 0;
        int tempArea=0;
        while(left<right){
            tempArea = (right-left) * Math.min(ar[left], ar[right]);
            if(tempArea>maxArea)
                maxArea = tempArea;
            if(ar[left]<ar[right])
                left++;
            else
                right--;
        }
        return maxArea;


    }
}