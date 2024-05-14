// Friends Pairing Problem - A person can go single or as a couple. We are to find the number of ways in which n persons can go to a party.
int friendsPairing(int n) {
    if (n == 0 || n == 1 || n == 2) {
        return n;
    }
    return friendsPairing(n - 1) + friendsPairing(n - 2) * (n - 1);
}