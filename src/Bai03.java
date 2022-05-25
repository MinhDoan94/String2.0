import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai03 {
    public static void main(String[] args) {
        String s;
        Scanner in = new Scanner(System.in);
        System.out.println("Xin mời nhập xâu s: ");
        s = in.nextLine();
        StringBuilder result = new StringBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(s);
        while (stringTokenizer.hasMoreTokens()) {
            char[] arr = stringTokenizer.nextToken().toCharArray();
            arr[0] = Character.toUpperCase(arr[0]);
            for (int i = 1; i < arr.length; i++) arr[i] = Character.toLowerCase(arr[i]);
            result.append(arr);
            result.append(" ");

        }
        System.out.println("Xâu sau khi chuẩn hóa là: " + result);
    }
}
