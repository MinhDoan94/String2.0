import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai04 {
    public static void main(String[] args) {
        String s;
        Scanner in = new Scanner(System.in);
        System.out.println("Xin mời nhập xâu: ");
        s = in.nextLine();
        String[] arr = new String[100];
        int max = 1;
        int n = 0;
        StringTokenizer s1 = new StringTokenizer(s);
        while (s1.hasMoreTokens()) {
            arr[n] = s1.nextToken();
            n++;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i].length() > max) max = arr[i].length();
        }
        System.out.println("Độ dài của từ lớn nhất là: " + max);
        System.out.println("Vị trí các từ có độ dài lớn nhất là : ");
        for (int i = 0; i < n; i++) if (arr[i].length() == max)
            System.out.println("  " + i);
    }
}
