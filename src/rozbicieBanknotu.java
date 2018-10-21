import java.lang.reflect.Array;
import java.util.Scanner;

public class rozbicieBanknotu {

//    int[] zloty = {200;100;50;10;5;2;1};
//    int[] grosz = {50;20;10;5;2;1};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // double a = scanner.nextDouble();
        double a = 2556.45;

        double banknot200 = Math.floor(a / 200);
        double wynikposredni1 = a % 200;
        if (banknot200 >= 1) {
            System.out.println("Liczba banknotu 200zł= " + banknot200);
        }

        double banknot100 = Math.floor(wynikposredni1 / 100);
        if (banknot100 >= 1) {
            wynikposredni1 = a % 100;
            System.out.println("Liczba banknotu 100zł= " + banknot100);
        }

        double banknot50 = Math.floor(wynikposredni1 / 50);
        if (banknot50 >= 1) {
            wynikposredni1 = a % 50;
        System.out.println("Liczba banknotu 50zł= " + banknot50);
        }

        double banknot20 = Math.floor(wynikposredni1 / 20);
        if (banknot20 >= 1) {
            wynikposredni1 = a % 20;
            System.out.println("Liczba banknotu 20zł= " + banknot20);
        }

        double banknot10 = Math.floor(wynikposredni1 / 10);
        if (banknot10 >= 1) {
            wynikposredni1 = a % 10;
            System.out.println("Liczba banknotu 10zł= " + banknot10);
        }

        double banknot5 = Math.floor(wynikposredni1 / 5);
        if (banknot5 >= 1) {
            wynikposredni1 = a % 5;
            System.out.println("Liczba banknotu 5zł= " + banknot5);
        }

        double banknot2 = Math.floor(wynikposredni1 / 2);
        if (banknot2 >= 1) {
            wynikposredni1 = a % 2;
            System.out.println("Liczba banknotu 2zł= " + banknot2 );
        }

        double banknot1 = Math.round(wynikposredni1 / 1);
        if (banknot1 >= 1) {
            wynikposredni1 = a % 1;
            System.out.println("Liczba banknotu 1zł= " + banknot1 + "   Reszta:" + wynikposredni1);
        }

    }
}




