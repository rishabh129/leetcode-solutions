class Solution {
public:
    int trap(vector<int>& height) {
        int len = height.size(); // length of the array
        if(len<3)
        return 0;   // if there are less than 3 elements, then no water can be trapped

        int leftMax[len], rightMax[len]; // leftMax and rightMax arrays to store the max height from left and right respectively
        leftMax[0] = height[0];
        rightMax[len-1] = height[len-1];

        // Filling the leftMax and rightMax arrays
        for(int i =1;i<len;i++){
            leftMax[i] = max(leftMax[i-1], height[i]);
        }

        for(int i =len-2;i>=0;i--){
            rightMax[i] = max(rightMax[i+1], height[i]);
        }

        int rainWater = 0;

        // Calculating the trapped water
        for(int i=0;i<len;i++){
            rainWater+= (min(leftMax[i], rightMax[i]) - height[i]);
        }
        return rainWater;

    }
};