package Week2;

import java.util.Scanner;

public class exercise3 {

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
    }

    public static void main(String[] args) {
        int n;
        double x;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the value of x: ");
        x = scanner.nextDouble();

        System.out.print("Please enter the degree n: ");
        n = scanner.nextInt();

        System.out.println("The value of (" + x + ")^" + n + " is: " + power(x, n));
    }
}
