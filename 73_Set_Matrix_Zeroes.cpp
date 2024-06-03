class Solution
{
public:
    void setZeroes(vector<vector<int>> &matrix)
    {
        int row = matrix.size();
        int col = matrix[0].size();
        vector<vector<int>> ans;

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                if (matrix[i][j] == 0)
                {
                    ans.push_back({i, j}); // store the row and column index of the cell which has 0
                }
            }
        }

        for (int i = 0; i < ans.size(); i++)
        {
            for (int j = 0; j < col; j++)
            {
                matrix[ans[i][0]][j] = 0;
            }
            for (int j = 0; j < row; j++)
            {
                matrix[j][ans[i][1]] = 0;
            }
        }
    }
};