class Solution
{
public:
    int passThePillow(int n, int time)
    {
        if (time > 2 * (n - 1))
        {
            time = time % (2 * (n - 1));
        }
        if (time < n)
        {
            return time + 1;
        }
        return n - (time - (n - 1));
    }
};