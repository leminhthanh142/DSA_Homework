package Week2;

import java.util.Scanner;
import java.util.Random;

public class ex2 {

    // Big O notation O(n^2)
    public static double Evaluate(double[] a, double x) {
        double s = 0;
        for (int i = 0; i < a.length; i++) {
            double p = 1;

            for (int k = a.length - 1; k > i; k--)
                p = p * x;

            s = s + a[i] * p;
        }
        return s;
    }


    // Big O notation O(n)
    public static double evaluate(double[] a, double x) {

        double result = a[0];
        System.out.println(a[0]);
        for (int i = 1; i < a.length; i++)
            result = result * x + a[i];

        return result;
    }

    public static void print_poly(double[] a) {
        System.out.println("The polynomial is:");
        int j = a.length - 1;
        for (double i : a) {
            if (j == 0)
                System.out.print("");
            else if (j != 1)
                System.out.print(i + "*x^" + j + " + ");
            else System.out.print(i + "*x" + " + ");
            j--;
        }
        System.out.println(a[a.length - 1]);
    }

    public static void main(String[] args) {
        int n;
        double[] c;
        double x;
        Random rd = new Random();

        System.out.print("Please enter the degree n of the polynomial: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        c = new double[n + 1];

        for (int i = 0; i < c.length; i++) {
            c[i] = rd.nextInt(10) + 1;
        }
        print_poly(c);

        System.out.print("Please enter the value of x: ");
        x = scanner.nextDouble();

        long startTime, stopTime, runTime;
        startTime = System.currentTimeMillis();
        System.out.println("The value P(" + x + ") = " + Evaluate(c, x));
        stopTime = System.currentTimeMillis();
        runTime = stopTime - startTime;
        System.out.println("First algorithm take: " + runTime + " milliseconds");
        System.out.println();

        startTime = System.currentTimeMillis();
        System.out.println("The value P(" + x + ") = " + evaluate(c, x));
        stopTime = System.currentTimeMillis();
        runTime = stopTime - startTime;
        System.out.println("Second algorithm take: " + runTime + " milliseconds");
    }
}
