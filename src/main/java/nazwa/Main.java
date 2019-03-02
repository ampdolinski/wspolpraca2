package nazwa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            try {
                System.out.println("Podaj, co chcesz zrobić (add / sub / div / mul / quit):");
                switch (scanner.nextLine().toLowerCase()) {
                    case "add":
                        SumEquation suma = new SumEquation(getNumX(), getNumY());
                        System.out.println(suma.calculate());
                        break;
                    case "sub":
                        SubtractEquation rownica = new SubtractEquation(getNumY(), getNumY());
                        System.out.println(rownica.calculate());
                        break;
                    case "div":
                        DivEquation dzielenie = new DivEquation(getNumX(), getNumY());
                        System.out.println(dzielenie.calculate());
                        break;
                    case "mul":
                        MulEquation mnozenie = new MulEquation(getNumX(), getNumY());
                        System.out.println(mnozenie.calculate());
                        break;
                    case "quit":
                        loop = false;
                        break;
                    default:
                        System.out.println("Nie ma takiej operacji, spóbuj jeszcze raz!");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Niepoprawnie wprowadzona wartość spróbuj jeszcze raz!");
            }
        }
        System.out.println("KONIEC");
    }

    private static double getNumX() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę:");
        return Double.parseDouble(scan.nextLine());
    }

    private static double getNumY() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj drugą liczbę:");
        return Double.parseDouble(scan.nextLine());
    }
}
