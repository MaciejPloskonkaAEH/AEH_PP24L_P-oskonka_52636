package pl.pp;

import java.util.Scanner;

public class mojaTrzeciaAplikacja {

    public static void main(String[] args) {

   /*     Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj proszę liczbę większą od 100:");

        //pętla WHILE (https://introcs.cs.princeton.edu/java/11cheatsheet/images/while.png)

        var number1 = scanner.nextDouble();

        while (number1 <= 100) {

            System.out.println("Liczba nie jest większa od 100, podaj jeszcze raz:");

            number1 = scanner.nextDouble();

        }

        System.out.println("Dziękuję! Podałeś liczbę: " + number1);

        //pętla DO..WHILE (https://introcs.cs.princeton.edu/java/11cheatsheet/images/do-while.png)

        double number2;

        do {

            System.out.println("Podaj proszę liczbę większą od 200:");

            number2 = scanner.nextDouble();

        } while (number2 <= 200);

        System.out.println("Dziękuję! Podałeś liczbę: " + number2);

        //pętla FOR (https://introcs.cs.princeton.edu/java/11cheatsheet/images/for.png)

        int wynik = 0;

        for (var i = 1; i <= 10; i++) {

            wynik = wynik + i;

            System.out.println("Przebieg numer " + i + " w pętli for, a zmienna wynik = " + wynik);

        }

        //instrukcje warunkowe IF..ELSE (https://introcs.cs.princeton.edu/java/11cheatsheet/images/if.png)

        System.out.println("Podaj proszę liczbę x: ");

        var x = scanner.nextDouble();

        System.out.println("Podaj proszę liczbę y: ");

        var y = scanner.nextDouble();

        if (x > y) {

            System.out.println("x jest większe od y");

        } else if (x < y) {

            System.out.println("x jest mniejsze od y");

        } else {

            System.out.println("x jest równe y");

        }

        //zakończenie programu za pomocą wpisania odpowiedniego klawisza
        while(true){System.out.println("Wpisz wartość -1 żeby wyjść z programu");

        var input = scanner.nextDouble();

        if (input == -1) {

            System.out.println("Wyjście...");

            break;

        }

    }

  scanner.close(); */

        Scanner scanner = new Scanner(System.in);

        //zad 1
        var number1 = 1;

        while (number1 > 0) {
            System.out.println("Podaj liczbe dni (podanie liczby niedodatniej zakonczy program): ");
            number1 = scanner.nextInt();

            if (number1 <= 0)
            {
                System.out.println("Wyjscie z programu: ");
                break;
            }

            System.out.println(number1 + " dni to " + number1/7 + " tygodnie i " + number1%7 + " dni");
        }



        //zad 2
        double number2 = 1;
        double number3 = 1;
        double number4 = 1;

        while (number2 != -1) {
            System.out.println("Podaj temperature w fahrenheitach (podanie liczby -1 zakonczy program): ");
            number2 = scanner.nextDouble();

            if (number2 == -1)
            {
                System.out.println("Wyjscie z programu ");
                break;
            }

            number2 = Math.round(number2);
            number3 = Math.round(number2/1.8 - 32.0);
            number4 = Math.round(number3 + 273.16);

            System.out.println("Fahrentheity: " + number2 +", " + "Celcjusze: " + number3 + ", " + "Kelwiny: " + number4);
        }

        scanner.close();
}

}