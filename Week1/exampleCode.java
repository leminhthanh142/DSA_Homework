package Week1;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class exampleCode {
    public static void main(String[] args) throws InterruptedException {
        printWithDelays("HELLO", TimeUnit.MILLISECONDS, 500);

    }

    public static void printWithDelays(String data, TimeUnit unit, long delay)
            throws InterruptedException {
        for (char ch : data.toCharArray()) {
            System.out.print(ch);
            unit.sleep(delay);
        }
    }
}
