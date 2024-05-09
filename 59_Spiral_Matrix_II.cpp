class Solution {
public:
    vector<vector<int>> generateMatrix(int n) {
        int sr=0,er=n-1, sc=0,ec=n-1; 
        // sr=starting row, er=ending row, sc=starting column, ec=ending column
        vector<vector<int>> spiral(er+1);

        for(int i=sr;i<=er;i++){ // creating a 2D vector
            spiral[i] = vector<int>(ec+1);
        }
        int num=1; // starting number

        while(sr<=er && sc<=ec){ // while the pointers are within the matrix 
            for(int i=sc;i<=ec;i++){ // top row
                spiral[sr][i]=num;
                num++;
            }
            for(int i=sr+1;i<=er;i++){ //right column
                spiral[i][ec]=num;
                num++;
            }
            for(int i=ec-1;i>=sc;i--){ // bottom row
                if(er==sr) // if only one row is left (so that it doesn't repeat)
                break;
                spiral[er][i]=num;
                num++;
            }
            for(int i=er-1;i>=sr+1;i--){ //left column
                if(ec==sc) // if only one column is left (so that it doesn't repeat)
                break;
                spiral[i][sc]=num;
                num++;
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