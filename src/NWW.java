import java.util.Scanner;

public class NWW {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(countNWW(a, b));
    }


    public static double countNWW(int a, int b){
    double wynik = (a*b)/(countNWD(a,b));
    return wynik;
    }


    public static double countNWD(int a, int b) {

        if (b == 0) {
            return a;
        }
        return countNWD(b, a%b);
    }

}

