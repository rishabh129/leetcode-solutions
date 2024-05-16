class Solution
{
public:
    vector<vector<int>> mergeSimilarItems(vector<vector<int>> &items1, vector<vector<int>> &items2)
    {
        int maxN = 0;
        for (auto i : items1)
        {
            maxN = max(maxN, i[0]);
        }
        for (auto i : items2)
        {
            maxN = max(maxN, i[0]);
        }

        int count[maxN + 1];

        for (int i = 0; i < maxN + 1; i++)
        {
            count[i] = 0;
        }

        for (int i = 0; i < items1.size(); i++)
        {
            count[items1[i][0]] += items1[i][1];
        }
        for (int i = 0; i < items2.size(); i++)
        {
            count[items2[i][0]] += items2[i][1];
        }

        vector<vector<int>> ret;

        for (int i = 1; i < maxN + 1; i++)
        {
            if (count[i] == 0)
                continue;
            ret.push_back({i, count[i]});
        }
        return ret;
    }
};