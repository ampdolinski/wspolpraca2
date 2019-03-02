import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj, co chcesz zrobić:");
        System.out.println("(add/sub/div/mul)");

        String dzialanie = scanner.nextInt();

//        String dzialanie = scanner.nextInt();

        double x;
        double y;

        System.out.println("Podaj pierwszą liczbę:");
        x = Double.parseDouble(scanner.nextLine());

        System.out.println("Podaj drugą liczbę:");
        y = Double.parseDouble(scanner.nextLine());


        do {
            switch (dzialanie){
                case "add":

            }



        } while ("quit");


    }
}
