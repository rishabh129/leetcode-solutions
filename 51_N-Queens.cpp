class Solution
{
public:
    bool isSafe(vector<string> &temp, int row, int col)
    {
        for (int i = row - 1; i >= 0; i--)
        {
            if (temp[i][col] == 'Q')
                return false;
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
        {
            if (temp[i][j] == 'Q')
                return false;
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < temp.size(); i--, j++)
        {
            if (temp[i][j] == 'Q')
                return false;
        }
        return true;
    }
    void check(vector<vector<string>> &ans, int row, vector<string> temp)
    {
        if (row == temp.size())
        {
            ans.push_back(temp);
            return;
        }

        for (int i = 0; i < temp.size(); i++)
        {
            if (isSafe(temp, row, i))
            {
                temp[row][i] = 'Q';
                check(ans, row + 1, temp);
                temp[row][i] = '.';
            }
        }
    }
    vector<vector<string>> solveNQueens(int n)
    {
        vector<vector<string>> ans;
        vector<string> temp(n, string(n, '.'));

        check(ans, 0, temp);
        return ans;
    }
};