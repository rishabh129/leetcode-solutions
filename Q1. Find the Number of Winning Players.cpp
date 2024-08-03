class Solution
{
public:
    int winningPlayerCount(int n, vector<vector<int>> &pick)
    {
        unordered_map<int, unordered_map<int, int>> playerBalls;

        for (const auto &p : pick)
        {
            int player = p[0];
            int color = p[1];
            playerBalls[player][color]++;
        }

        int count = 0;

        for (const auto &player : playerBalls)
        {
            int playerId = player.first;
            const auto &colorCs = player.second;
            for (const auto &colorC : colorCs)
            {
                if (colorC.second > playerId)
                {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
};