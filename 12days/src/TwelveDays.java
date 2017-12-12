import java.util.Scanner;

public class TwelveDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int increment = 1;

        System.out.println("welcome to twelve days!");

        System.out.println("Enter a name");
        String name = scanner.nextLine();

        System.out.println("Enter a present");
        String present = scanner.nextLine();

        System.out.println("Enter a day");
        int day = scanner.nextInt();

        System.out.println("on the "+day+" day of Christmas, "+name+" gave to me " +day+" "+present);
        increment++;

        if (increment == 12) {
            System.out.println("The Twelve days of are over! Merry Christmas Girls Who Code.");
        }

    }
}
