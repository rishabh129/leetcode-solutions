class Solution
{
public:
    int areaOfMaxDiagonal(vector<vector<int>> &dimensions)
    {
        int len = dimensions.size(), maxArea = 0;
        double maxDiag = 0, currDiag = 0;
        for (int i = 0; i < len; i++)
        {
            int l = dimensions[i][0], b = dimensions[i][1];
            currDiag = sqrt((l * l) + (b * b)); // Diagonal of rectangle
            if (currDiag == maxDiag)
            {
                maxArea = max(maxArea, l * b); // If diagonal is same, then check for max area
            }
            if (currDiag > maxDiag)
            {
                maxDiag = currDiag;
                maxArea = l * b;
            }
        }
        return maxArea;
    }
};
