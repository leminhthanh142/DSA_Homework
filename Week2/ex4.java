package Week2;

import java.util.Scanner;

public class ex4 {

    // Big O notation O(log n)
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // Big O notation O(n)
    public static int GCD(int m, int n) {
        int i = n;
        while (i > 1) {
            if (((m % i) == 0) && ((n % i) == 0))
                return i;
            i--;
        }
        return 1;
    }

    public static void main(String[] args) {
        int m, n;

        System.out.print("Please enter the integer m: ");
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();

        System.out.print("Please enter the integer n (n<=m): ");
        n = scanner.nextInt();


        long startTime, stopTime, runTime;
        startTime = System.currentTimeMillis();
        System.out.println("The gcd(" + m + "," + n + ") is: " + gcd(m, n));
        stopTime = System.currentTimeMillis();
        runTime = stopTime - startTime;
        System.out.println("First algorithm take: " + runTime + " milliseconds");
        System.out.println();

        startTime = System.currentTimeMillis();
        System.out.println("The gcd(" + m + "," + n + ") is: " + GCD(m, n));
        stopTime = System.currentTimeMillis();
        runTime = stopTime - startTime;
        System.out.println("Second algorithm take: " + runTime + " milliseconds");
    }
}
