import java.util.Scanner;

public class NWD {



    public static void main(String[] args) {
        System.out.println(countNWD());

    }

    public static double countNWD() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b == 0) {
            return a;
        }

        double wynik = a % b;
        return wynik;
    }

}
