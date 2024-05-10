// brute force

class Solution {
public:
    int countNegatives(vector<vector<int>>& grid) {
        int row= grid.size(), col = grid[0].size();
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]<0)
                count++;
            }
        }
        return count;
    }
};

// staircase search
// same as 74_Search_a_2D_Matrix.cpp
class Solution {
public:
    int countNegatives(vector<vector<int>>& grid) {
        int count=0, r=0, c=grid[0].size()-1;
        while(r<grid.size() && c>=0){
            if(grid[r][c]<0){
                count+=(grid.size()-r);
                c--;
            }
            else
                r++;
        }
        return count;
    }
};