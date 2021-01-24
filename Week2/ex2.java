package Week2;

import java.util.Scanner;
import java.util.Random;

public class ex2 {

    // Big O notation O(n^2)
    public static double Evaluate(double[] a, double x) {
        double s = 0;
        for (int i = 0; i < a.length; i++) {
            double p = 1;
            if (i != 0) {
                for (int k = 1; k <= i; k++)
                    p = p * x;
            }
            s = s + a[i] * p;
        }
        return s;
    }


    // Big O notation O(n)
    public static double evaluate(double[] a, double x) {
        double s = 0;
        int k = 0;
        for (double i : a) {
            s += i*Math.pow(x, k);
            k++;
        }
        return s;
    }

    public static void print_poly(double[] a) {
        System.out.println("The polynomial is:");
        for (int i = a.length - 1; i > 0; i--) {
            if (i != 1)
                System.out.print(a[i] + "*x^" + i + " + ");
            else
                System.out.print(a[i] + "*x" + " + ");
        }
        System.out.println(a[0]);
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
            c[i] = rd.nextInt(2*n) - n;
        }
        print_poly(c);

        System.out.print("Please enter the value of x: ");
        x = scanner.nextDouble();

        long startTime, stopTime, runTime;
        startTime = System.currentTimeMillis();
        System.out.println("The value P(" + x + ") = " + Evaluate(c, x));
        stopTime=System.currentTimeMillis();
        runTime = stopTime - startTime;
        System.out.println("First algorithm take: " + runTime + " milliseconds");
        System.out.println();

        startTime = System.currentTimeMillis();
        System.out.println("The value P(" + x + ") = " + evaluate(c, x));
        stopTime=System.currentTimeMillis();
        runTime = stopTime - startTime;
        System.out.println("Second algorithm take: " + runTime + " milliseconds");
    }
}
