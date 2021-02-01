package Week3;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        System.out.println(Encrypt(text));
    }

    public static String Encrypt(String text) {

        if (text.length() == 0) return text;

        StringBuilder result = new StringBuilder();
        String[] arr = text.split(" ");

        for (String s : arr) {

            int n = s.length();
            StringBuilder temp = new StringBuilder();

            for (int j = 0; j < n; j++) {
                if (j == 0)
                    temp.append((int) s.charAt(0));
                else if (j == 1)
                    temp.append(s.charAt(n - 1));
                else if (j == n - 1)
                    temp.append(s.charAt(1));
                else
                    temp.append(s.charAt(j));
            }

            result.append(temp).append(" ");
        }
        result.delete(result.length() - 1, result.length());
        return result.toString();
    }
}
