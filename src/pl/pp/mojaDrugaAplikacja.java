package pl.pp;
import java.util.Scanner;

public class mojaDrugaAplikacja {
    public static void main(String[] args) {
        //zad 1
        int x = 10;
        int y = x*2;
        int z = x*x;
        System.out.println("x = " + x + ", dwukrtonosc x = " + y + ", x kwadrat = " + z);

        //zad 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek: ");
        int wiek = scanner.nextInt();
        scanner.close();
        System.out.println("Wiek w sekundach: " + wiek*31556926);
    }
}