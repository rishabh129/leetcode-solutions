class Solution
{
public:
    bool isSafe(vector<vector<char>> &board, int row, int col, char digit)
    {
        for (int i = 0; i <= 8; i++)
        {
            if (i == row)
                continue;
            if (board[i][col] == digit)
            {
                return false;
            }
        }
        for (int i = 0; i <= 8; i++)
        {
            if (i == col)
                continue;
            if (board[row][i] == digit)
            {
                return false;
            }
        }
        int sr = (row / 3) * 3, sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++)
        {
            for (int j = sc; j < sc + 3; j++)
            {
                if (i == row && j == col)
                    continue;

                if (board[i][j] == digit)
                {
                    return false;
                }
            }
        }
        return true;
    }

    bool isValidSudoku(vector<vector<char>> &board)
    {
        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                if (board[i][j] > '0' && board[i][j] <= '9')
                {
                    if (!isSafe(board, i, j, board[i][j]))
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
};