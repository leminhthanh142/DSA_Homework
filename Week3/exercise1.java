package Week3;
import java.util.Scanner;
public class exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = input.nextInt();

        int [] arr = new int[n];

        for (int i=0; i<n; i++) {
            System.out.print("arr[" + i + "]=");
            arr[i] = input.nextInt();
        }

        int [] reArrangeArr = reArrange(arr, n);
        for (int i : reArrangeArr)
            System.out.print(i + " ");
    }

    public static int[] reArrange(int[] arr, int n) {

        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        int [] leftSubArr = new int[n];
        int [] rightSubArr = new int[n];

        for (int j : arr) {
            if (j > 0) rightSubArr[positiveCount++] = j;
            else if (j < 0) leftSubArr[negativeCount++] = j;
            else zeroCount++;
        }

        int index = 0;
        for (int i=0; i<negativeCount; i++) arr[index++] = leftSubArr[i];

        for (int i=0; i<zeroCount; i++) arr[index++] = 0;

        for (int i=0; i<positiveCount; i++) arr[index++] = rightSubArr[i];

        return arr;
    }
}