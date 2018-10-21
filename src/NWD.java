import java.util.Scanner;

public class NWD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(countNWD(a, b));
    }
    public static double countNWD(int a, int b) {

        if (b == 0) {
            return a;
        }
        return countNWD(b, a%b);
    }

}
