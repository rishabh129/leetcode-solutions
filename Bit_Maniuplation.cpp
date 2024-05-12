// Different functions for bit manipulation

// Include the necessary libraries

#include <iostream>
using namespace std;

// Odd or Even

bool isOdd(int n)
{
    return n & 1;
}

bool isEven(int n)
{
    return !isOdd(n);
}

// Set the ith bit

int setBit(int n, int i)
{
    return n | (1 << i);
}

// Clear the ith bit

int clearBit(int n, int i)
{
    return n & ~(1 << i);
}

// Toggle the ith bit - 0 to 1 and 1 to 0

int toggleBit(int n, int i)
{
    return n ^ (1 << i);
}

// Check if the ith bit is set

bool isSet(int n, int i)
{
    return n & (1 << i);
}

// Check if the ith bit is clear

bool isClear(int n, int i)
{
    return !isSet(n, i);
}

// Update the ith bit with a given value

int updateBit(int n, int i, int v)
{
    return (n & ~(1 << i)) | (v << i);
}

// Clear the rightmost set bit

int clearRightmostSetBit(int n)
{
    return n & (n - 1);
}

// Get the rightmost set bit

int getRightmostSetBit(int n)
{
    return n & -n;
}

// Clear all bits from the most significant bit to the ith bit

int clearBitsMSBtoI(int n, int i)
{
    return n & ((1 << i) - 1);
}

// Clear all bits from the ith bit to the 0th bit

int clearBitsIto0(int n, int i)
{
    return n & (-1 << (i + 1)); // or return n & ((~0) << (i + 1));
}

// clear range of bits from i to j

int clearRangeItoJ(int n, int i, int j)
{
    int a = -1 << (j + 1);
    int b = (1 << i) - 1;
    int mask = a | b;
    return n & mask;
}

// check if a number is a power of 2

bool isPowerOf2(int n)
{
    return n && !(n & (n - 1));
}

// Count the number of set bits

int countSetBits(int n)
{
    int count = 0;
    while (n)
    {
        if (n & 1)
            count++;
        n >>= 1;
    }
    return count;
}

// exponential function

int power(int a, int n)
{
    int res = 1;
    while (n)
    {
        if (n & 1)
            res *= a;
        a *= a;
        n >>= 1;
    }
    return res;
}

// swap two numbers

void swap(int &a, int &b)
{
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
}

// Main function

int main()
{
    cout << isOdd(5) << endl;
    cout << isEven(5) << endl;
    cout << setBit(5, 1) << endl;
    cout << clearBit(5, 2) << endl;
    cout << toggleBit(5, 1) << endl;
    cout << isSet(5, 1) << endl;
    cout << isClear(5, 1) << endl;
    cout << updateBit(5, 1, 1) << endl;
    cout << clearRightmostSetBit(5) << endl;
    cout << getRightmostSetBit(5) << endl;
    cout << clearBitsMSBtoI(15, 2) << endl;
    cout << clearBitsIto0(15, 2) << endl;
    return 0;
}