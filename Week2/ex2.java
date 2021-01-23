package Week2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        int n;
        double[] c;
        double x;

        System.out.println("Please enter the degree n of the polynomial:");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        c = new double[n + 1];

        for (int i = 0; i < c.length; i++) {
            System.out.println("Please enter the coefficient c[" + i + "]:");
            c[i] = scanner.nextDouble();
        }
        print_poly(c);

        System.out.println("Please enter the value of x:");
        x = scanner.nextDouble();

        System.out.println("The value P(" + x + ") = " + Evaluate(c, x));
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

    public static double Evaluate(double [] a, double x)
    {
        double s=0;
        for (int i=0; i<a.length; i++)
        {
            double p=1;
            if (i != 0)
            {
                for (int k=1; k<=i; k++)
                    p=p*x;
            }
            s=s+a[i]*p;
        }
        return s;
    }
}
