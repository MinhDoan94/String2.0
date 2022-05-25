public class Bai01 {
    public static void main(String[] args) {
        Check();
    }

    private static void Check() {
        String s;
        String s1;
        for (int i = 100000; i < 1000000; i++) {
            s = "";
            StringBuilder sb = new StringBuilder(String.valueOf(i));
            s += i;
            s1 = sb.reverse().toString();
            if (s.compareTo(s1) == 0) {
                System.out.printf("%d\n", i);
            }
        }
    }
}