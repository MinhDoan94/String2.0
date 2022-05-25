import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai05 {
    public static void main(String[] args) {
        String s;
        Scanner in = new Scanner(System.in);
        System.out.println("Xin mời nhập xâu họ đệm tên: ");
        s = in.nextLine();
        chuyendoi(s);

    }

    public static void chuyendoi(String s) {
        StringTokenizer tg = new StringTokenizer(s);
        StringBuffer result = new StringBuffer();
        String[] s1 = new String[100];
        int i = 1;
        while (tg.hasMoreTokens()) {
            s1[i] = tg.nextToken();
            i++;
        }
        result.append(s1[3]).append("  ");
        result.append(s1[1]).append("  ");
        result.append(s1[2]).append("  ");
        System.out.println(result);
    }
}
