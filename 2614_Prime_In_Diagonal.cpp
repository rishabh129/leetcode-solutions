class Solution {
public:
    bool checkPrime(int num){ // Function to check if a number is prime or not
        if(num==1)
        return false;

        for(int i=2;i<=num/2;i++){
            if(num%i==0)
            return false;
        }
        return true;
    }
    int diagonalPrime(vector<vector<int>>& nums) {
        int len=nums.size();
        vector<int> diag; // Vector to store the diagonal elements
        for(int i=0;i<len;i++){ // Loop to store the diagonal elements
            diag.push_back(nums[i][i]);
            diag.push_back(nums[i][len-i-1]);
        }
        
        sort(diag.begin(), diag.end()); // Sorting the diagonal elements
        for(int i=diag.size()-1;i>=0;i--){ 
            if(checkPrime(diag[i])) 
            return diag[i]; // Returning the largest prime number from the diagonal elements
        }
        return 0;
    }
};