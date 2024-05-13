// A floor is given of area 2 * n and a tile of size 2 * 1 is given. The task is to find the number of ways to tile the floor with the given tile. A tile can either be placed horizontally i.e as a 1 * 2 tile or vertically i.e as 2 * 1 tile.

// Frequently Asked in Amazon, Microsoft, Ola Cabs, Paytm, Snapdeal, Walmart

#include <iostream>
using namespace std;

int tilingWays(int n)
{
    if (n == 0 || n == 1) // If n=0 then one way to tile the floor i.e. not to tile the floor and if n=1 then one way to tile the floor i.e. place the tile vertically
        return 1;

    return tilingWays(n - 1) + tilingWays(n - 2);
}

int main()
{
    int n;
    cin >> n;
    cout << tilingWays(n) << endl;
    return 0;
}