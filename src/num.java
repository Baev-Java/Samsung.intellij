import java.util.Scanner;
public class num {
    class x{
        static Scanner sc = new Scanner(System.in);
        static int x = sc.nextInt();
        static String binary = Integer.toBinaryString(x);
        static String sixty = Integer.toHexString(x);
        String eight = String.valueOf(Long.parseLong(String.valueOf(8), x));

        public static void main(String[] args) {
            System.out.println(binary);
            System.out.println(sixty);
        }
    }
}
