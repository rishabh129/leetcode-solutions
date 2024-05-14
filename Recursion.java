// Different problems on recursion

public class Recursion {

// 1. Factorial of a number

int factorial(int n) {
    if (n == 0) {
        return 1;
    }
    return n * factorial(n - 1);
}

// 2. Fibonacci series

int fibonacci(int n) {
    if (n == 0 || n == 1) {
        return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
}

// 3. Tower of Hanoi

void towerOfHanoi(int n, char A, char B, char C) {
    if (n == 1) {
        System.out.println("Move 1 from " + A + " to " + C);
        return;
    }
    towerOfHanoi(n - 1, A, C, B);
    System.out.println("Move " + n + " from " + A + " to " + C);
    towerOfHanoi(n - 1, B, A, C);
}

// 4. Sum of digits of a number

int sumOfDigits(int n) {
    if (n == 0) {
        return 0;
    }
    return n % 10 + sumOfDigits(n / 10);
}

// 5. Power of a number

int power(int x, int n) {
    if (n == 0) {
        return 1;
    }
    return x * power(x, n - 1);
}

int powerOptimized(int x, int n) {
    if (n == 0) {
        return 1;
    }
    int temp = powerOptimized(x, n / 2);
    if (n % 2 == 0) {
        return temp * temp;
    } else {
        return x * temp * temp;
    }
}

// 6. GCD of two numbers

int gcd(int a, int b) {
    if (b == 0) {
        return a;
    }
    return gcd(b, a % b);
}

// 7. Reverse a string

String reverse(String s) {
    if (s.length() == 0) {
        return "";
    }
    return reverse(s.substring(1)) + s.charAt(0);
}

// 8. Print numbers from 1 to n

void printNumbers(int n) {
    if (n == 0) {
        return;
    }
    printNumbers(n - 1);
    System.out.println(n);
}

// 9. Print numbers from n to 1 

void printNumbersReverse(int n) {
    if (n == 0) {
        return;
    }
    System.out.println(n);
    printNumbersReverse(n - 1);
}

// 10. Check if array is sorted

boolean isSorted(int[] arr, int n) {
    if (n == 1) {
        return true;
    }
    return arr[n - 1] >= arr[n - 2] && isSorted(arr, n - 1);
}

// 11. Tiling problem

int tiling(int n) {
    if (n == 0 || n == 1) {
        return n;
    }
    return tiling(n - 1) + tiling(n - 2);
}

// 12. Remove duplicates from a string

String removeDuplicates(String s) {
    if (s.length() == 0) {
        return "";
    }
    if (s.charAt(0) == s.charAt(1)) {
        return removeDuplicates(s.substring(1));
    }
    return s.charAt(0) + removeDuplicates(s.substring(1));
}

// 13. Friends pairing problem - n friends can go single or in pairs 

int friendsPairing(int n) {
    if (n == 0 || n == 1 || n == 2) {
        return n;
    }
    return friendsPairing(n - 1) + friendsPairing(n - 2) * (n - 1);
}

// 14. Binary String without consecutive 1's

void binaryString(int n,int last, String s) {
    if (n == 0) {
        System.out.println(s);
        return;
    }
    binaryString(n - 1, 0, s + "0");
    if (last == 0) {
        binaryString(n - 1, s + "1");
    }
}

public static void main(String[] args) {
        
    Recursion r = new Recursion();
    System.out.println(r.factorial(5));
    System.out.println(r.fibonacci(5));
    r.towerOfHanoi(3, 'A', 'B', 'C');   
    System.out.println(r.sumOfDigits(12345));
    System.out.println(r.power(2, 5));
    System.out.println(r.powerOptimized(2, 5));
    System.out.println(r.gcd(12, 15));
    System.out.println(r.reverse("hello"));
    r.printNumbers(5);
    r.printNumbersReverse(5);
    int[] arr = {1, 2, 3, 4, 5};
    System.out.println(r.isSorted(arr, arr.length));
    System.out.println(r.tiling(4));
    System.out.println(r.removeDuplicates("aaabbbccc"));
    System.out.println(r.friendsPairing(3));
    r.binaryString(3, 0, "");
    }
}