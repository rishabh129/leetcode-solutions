
class Solution
{
public:
    int getWinner(vector<int> &skills, int k)
    {
        int n = skills.size();
        if (k >= n)
        {
            return *max_element(skills.begin(), skills.end());
        }
        int winner = skills[0];
        int winCount = 0;
        for (int i = 1; i < n; i++)
        {
            if (skills[i] > winner)
            {
                winner = skills[i];
                winCount = 1;
            }
            else
            {
                winCount++;
            }
            if (winCount == k)
            {
                return winner;
            }
        }
        return winner;
    }
};