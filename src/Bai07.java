import java.util.Scanner;

public class Bai07 {
    public static void main(String[] args) {
        String s1;
        String s2;
        Scanner in = new Scanner(System.in);
        System.out.println("Xin mời nhập xâu s1: ");
        s1 = in.nextLine();
        System.out.println("Xin mời nhập xâu s2: ");
        s2 = in.nextLine();
        int n = s2.length();
        String s = new String();
        String kt;
        System.out.println("Các vị trí của xâu s2 trong xâu s1 là: ");
        for (int i = 0; i < s1.length() - n + 1; i++) {
            kt = s1.substring(i, i + n);
            if (kt.equals(s2)) System.out.print(i + "   ");

        }

        s1 = s1.replaceAll(s2, s);

        System.out.println("\n Xâu s1 sau khi xóa tất cả các xâu s2 là: ");
        System.out.println(s1);
    }
}
