package Week2;

import java.util.Scanner;

public class ex3 {

    // Big O notation O(n)
    public static double Pow(double x, int n) {
        double s = 1;
        if (n == 0)
            return s;
        for (int i = 1; i <= n; i++)
            s = s * x;
        return s;
    }


    // Big O notation O(1)
    public static double pow (double x, double n) {
        return Math.pow(x, n);
    }

    public static void main(String[] args) {
        int n;
        double x;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the value of x: ");
        x = scanner.nextDouble();

        System.out.print("Please enter the degree n: ");
        n = scanner.nextInt();

        long startTime, stopTime, runTime;
        startTime = System.currentTimeMillis();
        System.out.println("The value of (" + x + ")^" + n + " is: " + Pow(x,n));
        stopTime=System.currentTimeMillis();
        runTime = stopTime - startTime;
        System.out.println("First algorithm take: " + runTime + " milliseconds");
        System.out.println();

        startTime = System.currentTimeMillis();
        System.out.println("The value of (" + x + ")^" + n + " is: " + pow(x,n));
        stopTime=System.currentTimeMillis();
        runTime = stopTime - startTime;
        System.out.println("Second algorithm take: " + runTime + " milliseconds");
    }
}
