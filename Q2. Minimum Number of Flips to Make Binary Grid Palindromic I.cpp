class Solution
{
public
    int minFlips(int[][] grid)
    {
        int m = grid.length;
        int n = grid[0].length;
        int minRowFlips = 0;
        int minColFlips = 0;
        for (int i = 0; i < m; i++)
        {
            minRowFlips += countFlips(grid[i]);
        }
        for (int j = 0; j < n; j++)
        {
            int[] col = new int[m];
            for (int i = 0; i < m; i++)
            {
                col[i] = grid[i][j];
            }
            minColFlips += countFlips(col);
        }
        return Math.min(minRowFlips, minColFlips);
    }

public
    int countFlips(int[] array)
    {
        int flips = 0;
        int left = 0;
        int right = array.length - 1;
        while (left < right)
        {
            if (array[left] != array[right])
            {
                flips++;
            }
            left++;
            right--;
        }
        return flips;
    }
}