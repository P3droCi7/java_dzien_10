import java.util.Scanner;

public class liczbaPierwsza {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(returnIfPrime(a));

    }

    public static int returnIfPrime(int a) {

        for (int i = 1; i <= a; i++) {
            if (a%i == 0){
              return 0;
            }
            else if(a / a == 1 && a / 1 == a) {
                return a;
            }
        }
        return 0;

    }
}

