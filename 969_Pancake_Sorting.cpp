class Solution
{
public:
    int find(vector<int> &arr, int index)
    {
        for (int i = 0; i < index; i++)
        {
            if (arr[i] == index)
                return i;
        }
        return -1;
    }
    void flip(vector<int> &arr, int len)
    {
        for (int i = 0; i < len / 2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = temp;
        }
    }
    vector<int> pancakeSort(vector<int> &arr)
    {
        int len = arr.size();
        vector<int> ans;
        while (len != 1)
        {
            int maxIndex = find(arr, len);
            flip(arr, maxIndex + 1);
            flip(arr, len);
            ans.push_back(maxIndex + 1);
            ans.push_back(len);
            len--;
        }
        return ans;
    }
};