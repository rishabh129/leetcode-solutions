class Solution {
public:
    int diagonalSum(vector<vector<int>>& mat) {
        int sum=0, len = mat.size();

        for(int i=0;i<len;i++)
            for(int j=0;j<len;j++)
                if(i==j || i+j==len-1) // i==j for primary diagonal and i+j==len-1 for secondary diagonal
                    sum+=mat[i][j];
        
        return sum;
    }
};

// better solution
class Solution {
public:
    int diagonalSum(vector<vector<int>>& mat) {
        int sum=0, len = mat.size();

        for(int i=0;i<len;i++){
            sum+=mat[i][len-1-i]+mat[i][i]; // sum of primary and secondary diagonal
            
        }
        if(len%2!=0)
        sum-=mat[len/2][len/2];
        return sum;
    }
};