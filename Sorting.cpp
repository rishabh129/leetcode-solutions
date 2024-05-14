// Sorting Algorithms

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

// swap function
void swap(int &a, int &b)
{
    int temp = a;
    a = b;
    b = temp;
}

// Bubble Sort - O(n^2)
void bubbleSort(vector<int> &arr)
{
    int n = arr.size();
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n - i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                swap(arr[j], arr[j + 1]);
            }
        }
    }
}

// Selection Sort - O(n^2)
void selectionSort(vector<int> &arr)
{
    int n = arr.size();
    for (int i = 0; i < n; i++)
    {
        int minIndex = i;
        for (int j = i + 1; j < n; j++)
        {
            if (arr[j] < arr[minIndex])
            {
                minIndex = j;
            }
        }
        swap(arr[i], arr[minIndex]);
    }
}

// Insertion Sort - O(n^2)
void insertionSort(vector<int> &arr)
{
    int n = arr.size();
    for (int i = 1; i < n; i++)
    {
        int curr = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > curr)
        {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = curr;
    }
}

// Counting Sort - O(n+k) where k is the range of the non-negative key values
void countingSort(vector<int> &arr)
{
    int n = arr.size();
    int maxElement = *max_element(arr.begin(), arr.end());
    vector<int> count(maxElement + 1, 0);
    vector<int> output(n, 0);

    for (int i = 0; i < n; i++)
    {
        count[arr[i]]++;
    }

    for (int i = 1; i <= maxElement; i++)
    {
        count[i] += count[i - 1];
    }

    for (int i = n - 1; i >= 0; i--)
    {
        output[count[arr[i]] - 1] = arr[i];
        count[arr[i]]--;
    }

    for (int i = 0; i < n; i++)
    {
        arr[i] = output[i];
    }
}

// print array
void printArray(vector<int> &arr)
{
    for (int i = 0; i < arr.size(); i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}

// main function

int main()
{
    vector<int> arr = {64, 34, 25, 12, 22, 11, 90};
    cout << "Original Array: ";
    printArray(arr);

    // Bubble Sort
    bubbleSort(arr);
    cout << "Bubble Sort: ";
    printArray(arr);

    // Selection Sort
    selectionSort(arr);
    cout << "Selection Sort: ";
    printArray(arr);

    // Insertion Sort
    insertionSort(arr);
    cout << "Insertion Sort: ";
    printArray(arr);

    // Counting Sort
    countingSort(arr);
    cout << "Counting Sort: ";
    printArray(arr);

    return 0;
}