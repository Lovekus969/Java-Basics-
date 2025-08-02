import java.util.Scanner;

public class BMWAutoShop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to BMW Auto Shop");
        System.out.println("Enter error code (1-4):");
        System.out.println("1: Engine Light");
        System.out.println("2: Brake System");
        System.out.println("3: Oil Level");
        System.out.println("4: Battery Issue");

        int errorCode = sc.nextInt();
        String input;

        switch (errorCode) {
            case 1:
                System.out.println("ENGINE ERROR: Check engine light is ON");
                System.out.println("Is engine overheating? (yes/no)");
                input = sc.next();
                if (input.equalsIgnoreCase("yes")) {
                    System.out.println("Action: Check coolant system and thermostat.");
                } else {
                    System.out.println("Action: Inspect oxygen sensor and fuel system.");
                }
                break;

            case 2:
                System.out.println("BRAKE ERROR: Brake system warning");
                System.out.println("Is brake fluid low? (yes/no)");
                input = sc.next();
                if (input.equalsIgnoreCase("yes")) {
                    System.out.println("Action: Refill brake fluid.");
                } else {
                    System.out.println("Action: Inspect ABS module or brake pads.");
                }
                break;

            case 3:
                System.out.println("OIL LEVEL WARNING");
                System.out.println("Was last oil service over 6 months ago? (yes/no)");
                input = sc.next();
                if (input.equalsIgnoreCase("yes")) {
                    System.out.println("Action: Schedule oil change service.");
                } else {
                    System.out.println("Action: Top up oil manually.");
                }
                break;

            case 4:
                System.out.println("BATTERY ISSUE DETECTED");
                System.out.println("Is battery older than 3 years? (yes/no)");
                input = sc.next();
                if (input.equalsIgnoreCase("yes")) {
                    System.out.println("Action: Replace battery.");
                } else {
                    System.out.println("Action: Clean terminals or test alternator.");
                }
                break;

            default:
                System.out.println("Unknown error code. Please contact technician.");
        }

        sc.close();
    }
}
