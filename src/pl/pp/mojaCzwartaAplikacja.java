package pl.pp;
import java.util.Scanner;
public class mojaCzwartaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //zad 1
        int min = 1;
        int max = 2;
        int x = 0;
        int suma = 0;

        while (max >= min) {
            System.out.println("Podaj dolny limit liczb całkowitych: ");
            min = scanner.nextInt();
            System.out.println("Podaj górny limit liczb całkowitych: ");
            max= scanner.nextInt();

            if (min >= max) {
                System.out.println("Koniec");
                break;
            }
            else {
                suma = 0;
                x = min;
                while (max >= x) {
                    suma = suma + x*x;
                    x++;
                }
            }
            System.out.println("Suma wszystkich kwadratów liczb całkowitch z podanego zakresu: " + suma);
            }


        //zad 2
        System.out.println("Wybierz działanie wpisując jego numer (opcje ponizej):" + '\n' +
                "1 - dodawanie" + '\n' +
                "2 - odejmowanie" + '\n' +
                "3 - mnozenie" + '\n' +
                "4 - dzielenie");
        int nr = scanner.nextInt();

        System.out.println("Podaj pierwsza liczbe: ");
        double a = scanner.nextDouble();
        System.out.println("Podaj druga liczbe: ");
        double b = scanner.nextDouble();

        if (nr == 1) {
            System.out.println(a+b);
        }
        else if (nr == 2) {
            System.out.println(a-b);
        }
        else if (nr == 3) {
            System.out.println(a*b);
        }
        else if (nr == 4) {
            System.out.println(a/b);
        }

        scanner.close();
    }
}