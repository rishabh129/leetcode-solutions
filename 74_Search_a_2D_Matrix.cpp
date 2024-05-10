class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int row = matrix.size(), col = matrix[0].size();
        int ind=0;
        for(int i=0;i<row;i++){ // Find the row where target can be present
            if(matrix[i][0]==target)
            return true;
            if(matrix[i][0]<target){
                ind = i;
            }
        }
        for(int i=0;i<col;i++){ // Check if target is present in that row
            if(matrix[ind][i]==target)
            return true;
        }
        return false;
    }
};