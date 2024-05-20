class Solution
{
public:
    bool isSafe(vector<vector<char>> &board, int row, int col, char digit)
    {
        for (int i = 0; i < 9; i++)
        {
            if (board[i][col] == digit || board[row][i] == digit)
                return false;
        }
        int sr = (row / 3) * 3, sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++)
        {
            for (int j = sc; j < sc + 3; j++)
            {
                if (board[i][j] == digit)
                    return false;
            }
        }
        return true;
    }

    bool sudoku(vector<vector<char>> &board)
    {
        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                if (board[i][j] == '.')
                {
                    for (char k = '1'; k <= '9'; k++)
                    {
                        if (isSafe(board, i, j, k))
                        {
                            board[i][j] = k;
                            if (sudoku(board))
                            {
                                return true;
                            }
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    void solveSudoku(vector<vector<char>> &board)
    {
        sudoku(board);
    }
};