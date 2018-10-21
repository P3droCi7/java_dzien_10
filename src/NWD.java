import java.util.Scanner;

public class NWD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(countNWD(a, b));
    }

    //metoda rekurencyjna
    public static double countNWD(int a, int b) {

        if (b == 0) {
            return a;
        }
        return countNWD(b, a % b);
    }

    //metoda iteracyjna
//    public static int gcd(int a, int b){
//        while (b != a){
//            int temp = a;
//            a = b;
//            b = temp % b;
//        }
//        return a;
//    }

}
