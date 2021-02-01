package Week2;

import java.util.Random;
import java.util.Scanner;

public class exercise1 {

    // Big O notation O(log n)
    public static int binarySearch(int[] arr, int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, left, mid - 1, x);

            return binarySearch(arr, mid + 1, right, x);
        }
        return -1;
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[minIndex])
                    minIndex = j;

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("Enter size of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = rd.nextInt(2 * n) - n;

        int[] sortedArr = selectionSort(arr);
        for (int i : sortedArr)
            System.out.print(i + " ");
        System.out.println();

        System.out.print("Enter number to search: ");
        int x = input.nextInt();

        System.out.println("Result: " + binarySearch(sortedArr, 0, n-1, x));
    }
}