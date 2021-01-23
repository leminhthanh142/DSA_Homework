package Week2;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        int m, n;

        System.out.println("Please enter the integer m:");
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();

        System.out.println("Please enter the integer n (n<=m):");
        n = scanner.nextInt();

        System.out.println("The gcd("+ m + "," + n + ") is: " + GCD(m,n));
    }

    public static int GCD(int a, int b) {
        if (b == 0)
            return a;
        return GCD(b, a % b);
    }

}
