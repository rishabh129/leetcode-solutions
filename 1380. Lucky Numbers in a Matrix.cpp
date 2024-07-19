class Solution
{
public:
    vector<int> luckyNumbers(vector<vector<int>> &matrix)
    {
        vector<int> ans;

        int r = matrix.size();
        int c = matrix[0].size();

        int idx = -1;
        int num = INT_MAX;
        bool check = true;

        for (int i = 0; i < r; i++)
        {
            num = INT_MAX;
            for (int j = 0; j < c; j++)
            {

                if (matrix[i][j] < num)
                {
                    num = matrix[i][j];
                    idx = j;
                }
            }

            for (int j = 0; j < r; j++)
            {
                if (matrix[j][idx] > num)
                {
                    check = false;
                    break;
                }
            }
            if (check)
            {
                ans.push_back(num);
            }
            check = true;
        }
        return ans;
    }
};