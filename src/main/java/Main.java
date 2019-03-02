import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x;
        double y;
        boolean loop = true;

        while (loop) {
            System.out.print("Podaj pierwszą liczbę:");
            x = Double.parseDouble(scanner.nextLine());

            System.out.print("Podaj drugą liczbę:");
            y = Double.parseDouble(scanner.nextLine());

            System.out.println("Podaj, co chcesz zrobić (add / sub / div / mul / quit):");
            switch (scanner.nextLine().toLowerCase()) {
                case "add":
                    SumEquation suma = new SumEquation(x, y);
                    System.out.println(suma.calculate());
                    break;
                case "sub":
                    SubtractEquation rownica = new SubtractEquation(x, y);
                    System.out.println(rownica.calculate());
                    break;
                case "div":
                    DivEquation dzielenie = new DivEquation(x, y);
                    System.out.println(dzielenie.calculate());
                    break;
                case "mul":
                    MulEquation mnozenie = new MulEquation(x, y);
                    System.out.println(mnozenie.calculate());
                    break;
                case "quit":
                    loop = false;
                    break;
                default:
                    System.out.println("Nie ma takiej operacji, spóbuj jeszcze raz!");
                    break;
            }
        }
        System.out.println("KONIEC");
    }
}
