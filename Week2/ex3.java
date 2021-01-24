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

    // Big O notation O(log n)
    public static double power(double x, int y) {
        double temp;
        if (y == 0) return 1;

        temp = power(x, y / 2);

        if (y % 2 == 0)
            return temp * temp;
        else {
            if (y > 0)
                return x * temp * temp;
            else
                return (temp * temp) / x;
        }

        //        double result = 1;
//
//        while (n != 0) {
//            if (n > 0) {
//                result *= x;
//                --n;
//            }
//
//            if (n < 0) {
//                result /= x;
//                ++n;
//            }
//        }

//        return result;
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
        System.out.println("The value of (" + x + ")^" + n + " is: " + Pow(x, n));
        stopTime = System.currentTimeMillis();
        runTime = stopTime - startTime;
        System.out.println("First algorithm take: " + runTime + " milliseconds");
        System.out.println();

        startTime = System.currentTimeMillis();
        System.out.println("The value of (" + x + ")^" + n + " is: " + power(x, n));
        stopTime = System.currentTimeMillis();
        runTime = stopTime - startTime;
        System.out.println("Second algorithm take: " + runTime + " milliseconds");
    }
}
