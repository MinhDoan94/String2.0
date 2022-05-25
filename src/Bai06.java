import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai06 {
    public static void main(String[] args) {
        String s;
        Scanner in = new Scanner(System.in);
        System.out.println("Xin mời nhập xâu s: ");
        s = in.nextLine();
        sapxep(s);
    }

    public static void sapxep(String s) {
        String tg;
        StringTokenizer s1 = new StringTokenizer(s);
        int n = s1.countTokens();
        String[] arr = new String[n];
        int i = 0;
        while (s1.hasMoreTokens()) {
            arr[i] = s1.nextToken();
            i++;

        }
        for (int k = 0; k < n - 1; k++)
            for (int j = k + 1; j < n; j++) {
                if (arr[k].compareTo(arr[j]) > 0) {
                    tg = arr[k];
                    arr[k] = arr[j];
                    arr[j] = tg;
                }
            }

        for (int j = 0; j < n; j++)
            System.out.print(arr[j] + "  ");

    }
}
