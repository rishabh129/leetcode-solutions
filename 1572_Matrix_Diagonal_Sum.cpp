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