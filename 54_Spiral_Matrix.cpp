class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int sr=0,er=matrix.size()-1, sc=0,ec=matrix[0].size()-1;
        // startRow = sr, endRow = er, startColumn = sc, endColumn = ec
        vector<int> spiral;
        while(sr<=er && sc<=ec){ //base case
            for(int i=sc;i<=ec;i++){ //top row
                spiral.push_back(matrix[sr][i]);
            }
            for(int i=sr+1;i<=er;i++){ //right column
                spiral.push_back(matrix[i][ec]);
            }
            for(int i=ec-1;i>=sc;i--){ // bottom row
                if(er==sr) // if only one row is left (so that it doesn't repeat)
                break;
                spiral.push_back(matrix[er][i]);
            }
            for(int i=er-1;i>=sr+1;i--){ //left column
                if(ec==sc) // if only one column is left (so that it doesn't repeat)
                break;
                spiral.push_back(matrix[i][sc]);
            }
            //updating the pointers
            ec-=1;
            er-=1;
            sc+=1;
            sr+=1;
        }
        return spiral;
    }
};