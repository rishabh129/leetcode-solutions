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
            {
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < temp.size(); i--, j++)
        {
            if (temp[i][j] == 'Q')
                return false;
        }
        return true;
    }

    void nQueens(vector<string> temp, int row, int &count)
    {
        if (row == temp.size())
        {
            count++;
            return;
        }

        for (int i = 0; i < temp.size(); i++)
        {
            if (isSafe(temp, row, i))
            {
                temp[row][i] = 'Q';
                nQueens(temp, row + 1, count);
                temp[row][i] = '.';
            }
        }
    }
    int totalNQueens(int n)
    {
        vector<string> temp(n, string(n, '.'));

        int count = 0;
        nQueens(temp, 0, count);
        return count;
    }
};