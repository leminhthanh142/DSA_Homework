package Week2;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int n;
        double x;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value of x:");
        x = scanner.nextDouble();

        System.out.println("Please enter the degree n:");
        n = scanner.nextInt();

//        System.out.println("The value of (" + x + ")^" + n + " is: " + Pow(x, n));

        long startTime, stopTime, elapsedTime;
        startTime=System.currentTimeMillis();
        System.out.println("The maximum subsequence sum is: " + Pow(x, n));
        stopTime=System.currentTimeMillis();
        elapsedTime=stopTime - startTime;
        System.out.println("Fist: " + elapsedTime);

        startTime=System.currentTimeMillis();
        System.out.println("The maximum subsequence sum is: " + pow(x, n));
        stopTime=System.currentTimeMillis();
        elapsedTime=stopTime - startTime;
        System.out.println("second: " + elapsedTime);
    }

    public static double Pow(double x, int n) {
        double s = 1;
        if (n == 0)
            return s;
        for (int i = 1; i <= n; i++)
            s = s * x;
        return s;
//        return Math.pow(x, n);
    }

    public static double pow (double x, double n) {
        return Math.pow(x, n);
    }

}
