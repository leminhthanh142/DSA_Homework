package Week2;

import java.util.Scanner;

public class exercise4 {

    // Big O notation O(log n)
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int m, n;

        System.out.print("Please enter the integer m: ");
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();

        System.out.print("Please enter the integer n (n<=m): ");
        n = scanner.nextInt();
        System.out.println("The gcd(" + m + "," + n + ") is: " + gcd(m, n));
    }
}
