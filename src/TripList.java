import java.util.ArrayList;
import java.util.Scanner;

public class TripList {

    private static ArrayList<Trip> TripList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);


    public static void addSkiTrip(Scanner sc) {

        SkiTrip x = new SkiTrip();

// Country
        String country = "";
        while (true) {
            System.out.println("\nHvilket land? ");
            country = sc.nextLine().trim();

            if (country.matches("[A-Za-zÆØÅæøå ]+")) {
                break;
            } else {
                Menu.inputFejl("Land", "Navn må kun indeholde bogstaver.\n");
            }
        }
        x.setCountry(country);

// Days
        int days = 0;
        while (true) {
            System.out.println("\nHvor mange dage? ");

            if (sc.hasNextInt()) {
                days = sc.nextInt();
                sc.nextLine(); // rydder ENTER væk
                break;
            } else {
                Menu.inputFejl("Dage", "Antal dage skal være et tal.\n");
                sc.nextLine(); // rydder ugyldigt input væk
            }
        }
        x.setDays(days);

// ExpensiveRank
        double rank = 0;
        while (true) {
            System.out.println("\nHvor dyrt er landet på en skal fra 1-10? ");

            if (sc.hasNextDouble()) {
                rank = sc.nextDouble();
                sc.nextLine(); // rydder ENTER væk

                if (rank > 0 && rank <= 10) {
                    break;
                } else {
                    Menu.inputFejl("Tallet", "Det skal være mellem 1-10.\n");
                }
            } else {
                Menu.inputFejl("Tallet", "Det skal være et tal.\n");
                sc.nextLine(); // rydder ugyldigt input væk
            }
        }
        x.setExpensiveRank(rank);

// involvesFlying
        while (true) {
            System.out.println("\nSkal man flyve dertil? (J/N): ");
            String flyve = sc.nextLine();
            if (flyve.equalsIgnoreCase("J")) {
                x.setInvolvesFlying(true);
                break;
            } else if (flyve.equalsIgnoreCase("N")) {
                x.setInvolvesFlying(false);
                break;
            } else {
                Menu.inputFejl("Input", "Skriv J eller N\n");
            }
        }

// Busy
        while (true) {
            System.out.println("\nEr det højsæson? (J/N): ");
            String højsæson = sc.nextLine();

            if (højsæson.equalsIgnoreCase("J")) {
                x.setBusy(true);
                break;
            } else if (højsæson.equalsIgnoreCase("N")) {
                x.setBusy(false);
                break;
            } else {
                Menu.inputFejl("Input", "Skriv J eller N\n");
            }
        }

// Ski Resort
        String resort = "";
        while (true) {
            System.out.println("\nNavn på resort? ");
            resort = sc.nextLine().trim();

            if (resort.matches("[A-Za-zÆØÅæøå ]+")) {
                break;
            } else {
                Menu.inputFejl("Resort", "Navn må kun indeholde bogstaver.\n");
            }
        }
        x.setSkiResort(resort);

        TripList.add(x);
        System.out.println("\nRejse er gemt i listen :-) \n");
        Menu.mainMenu();
//        System.out.println(Farver.GREEN + "\nNyt Medlem oprettet:\n" + Farver.RESET + x);
//        FileHandler.writeToMemberlistFile("MedlemsListe.txt", MemberController.MemberList);
//        ConsoleHandler.memberMenu(scanner);
    }



    public static void addBeachTrip(Scanner sc) {

        BeachTrip x = new BeachTrip();

// Country
        String country = "";
        while (true) {
            System.out.println("\nHvilket land? ");
            country = sc.nextLine().trim();

            if (country.matches("[A-Za-zÆØÅæøå ]+")) {
                break;
            } else {
                Menu.inputFejl("Land", "Navn må kun indeholde bogstaver.\n");
            }
        }
        x.setCountry(country);

// Days
        int days = 0;
        while (true) {
            System.out.println("\nHvor mange dage? ");
            if (sc.hasNextInt()) {
                days = sc.nextInt();
                sc.nextLine(); // rydder enter væk
                break;
            } else {
                Menu.inputFejl("Dage", "Antal dage skal være et tal.\n");
                sc.nextLine(); // ryd ugyldigt input
            }
        }
        x.setDays(days);

// ExpensiveRank
        double rank = 0;
        while (true) {
            System.out.println("\nHvor dyrt er landet på en skala fra 1-10? ");
            if (sc.hasNextDouble()) {
                rank = sc.nextDouble();
                sc.nextLine(); // rydder enter væk

                if (rank > 0 && rank <= 10) {
                    break;
                } else {
                    Menu.inputFejl("Tallet", "Det skal være mellem 1-10.\n");
                }
            } else {
                Menu.inputFejl("Tallet", "Det skal være et tal.\n");
                sc.nextLine(); // ryd ugyldigt input
            }
        }
        x.setExpensiveRank(rank);

// involvesFlying
        while (true) {
            System.out.println("\nSkal man flyve dertil? (J/N): ");
            String flyve = sc.nextLine();
            if (flyve.equalsIgnoreCase("J")) {
                x.setInvolvesFlying(true);
                break;
            } else if (flyve.equalsIgnoreCase("N")) {
                x.setInvolvesFlying(false);
                break;
            } else {
                Menu.inputFejl("Input", "Skriv J eller N\n");
            }
        }

// Dykke
        while (true) {
            System.out.println("\nEr det muligt at dykke? (J/N): ");
            String dykke = sc.nextLine();
            if (dykke.equalsIgnoreCase("J")) {
                x.setDiveOption(true);
                break;
            } else if (dykke.equalsIgnoreCase("N")) {
                x.setDiveOption(false);
                break;
            } else {
                Menu.inputFejl("Input", "Skriv J eller N\n");
            }
        }

// Temperatur
        int temp = 0;
        while (true) {
            System.out.println("\nHvad er den gennemsnitlige temperatur? ");
            if (sc.hasNextInt()) {
                temp = sc.nextInt();
                sc.nextLine(); // ryd enter
                break;
            } else {
                Menu.inputFejl("Temperaturen", "Temperaturen skal være et tal.\n");
                sc.nextLine(); // ryd ugyldigt input
            }
        }
        x.setAverageTemp(temp);

        TripList.add(x);
        System.out.println("\nRejse er gemt i listen :-) \n");
        Menu.mainMenu();
//        System.out.println(Farver.GREEN + "\nNyt Medlem oprettet:\n" + Farver.RESET + x);
//        FileHandler.writeToMemberlistFile("MedlemsListe.txt", MemberController.MemberList);
//        ConsoleHandler.memberMenu(scanner);
    }



    public static void browseTrips(Scanner sc) {

        System.out.println("\nListe over oprettet rejser:\n");

        boolean found = false;

        for (Trip t : TripList) {
            found = true;
            System.out.println(t);
            }

        if (!found) {
            System.out.println("\nDer er ikke oprettet rejser endnu..\n");
        }

        System.out.println("\n  1. Tilbage");

        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            Menu.mainMenu();
        } else {
            Menu.inputFejl("valg", "Tast 1\n");
        }
    }
    }


