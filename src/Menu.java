import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {


    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        mainMenu();


    }

    public static void mainMenu() {

        int choice;

        System.out.println("\n---------------------------\nOpret eller se rejser:\n");
        System.out.println("---------------------------\n1. Opret rejse ");
        System.out.println("2. Se rejser ");
        System.out.println("3. Exit " +
                "\n---------------------------\n");

        try {
            choice = sc.nextInt();
            sc.nextLine();

        } catch (InputMismatchException e) {
            inputFejl("indtastning", "Indtast enden 1 eller 2.\n");
            sc.nextLine();
            mainMenu();
            return;
        }

        switch (choice) {
            case 1:
                createNewTrip();
                break;
            case 2:
                TripList.browseTrips(sc);
                break;
            case 3:
                System.out.println(("På gensyn.. \n"));
                return;
            default:
                inputFejl("indtastning", "Indtast enden 1 eller 2.\n");
        }


    }

    public static void createNewTrip() {



        if(whatKindOfTrip().equalsIgnoreCase("Skiferie")) {
            TripList.addSkiTrip(sc);

        } else if (whatKindOfTrip().equalsIgnoreCase("Badeferie")) {
            TripList.addBeachTrip(sc);
        }
        }



    public static String whatKindOfTrip() {
        int choice = 0;

        System.out.println("\nHvilken slags rejse ønsker du at oprette?:\n");
        System.out.println("1. Skiferie");
        System.out.println("2. Badeferie");
        System.out.println("3. Tilbage ");

        try {
            choice = sc.nextInt();
            sc.nextLine();

        } catch (InputMismatchException e) {
            inputFejl("indtastning", "Indtast enden 1 eller 2.\n");
            sc.nextLine();
            mainMenu();
        }

        switch (choice) {
            case 1:
                return "Skiferie";
            case 2:
                return "Badeferie";
            case 3:
                mainMenu();
                return "";
            default:
                inputFejl("indtastning", "Indtast enden 1 eller 2.\n");
                return whatKindOfTrip();

        }
    }



    public static void inputFejl(String enhed, String forklaring) {
        System.out.println("Ugyldig " + enhed + ". Prøv igen..\n" + forklaring);


    }


}




