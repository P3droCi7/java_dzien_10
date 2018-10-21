import java.util.Scanner;

public class rozbicieBanknotu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // double a = scanner.nextDouble();
        double a = 156.45;

        double banknot200 = Math.floor(a / 200);
        double wynikposredni1 = a % 200;
        if (banknot200 > 1) {
            System.out.println("Liczba banknotu 200zł= " + banknot200);
        }

        double banknot100 = Math.floor(wynikposredni1 / 100);
        wynikposredni1 = a % 100;
        if (banknot100 >= 1) {
            System.out.println("Liczba banknotu 100zł= " + banknot100 + "   " + wynikposredni1);
        }
    }
}




