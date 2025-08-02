import java.util.Scanner;

public class WeeklySchedule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a number from 1 to 7 to see the schedule:");
        System.out.println("1: Monday, 2: Tuesday, 3: Wednesday, 4: Thursday, 5: Friday, 6: Saturday, 7: Sunday");

        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday: Team meeting at 9 AM, Project work, Gym in the evening.");
                break;
            case 2:
                System.out.println("Tuesday: Code review, Learn Java concepts, Evening walk.");
                break;
            case 3:
                System.out.println("Wednesday: Focused DSA practice, Client call at 3 PM.");
                break;
            case 4:
                System.out.println("Thursday: Web development project, Submit assignment.");
                break;
            case 5:
                System.out.println("Friday: Debugging session, Weekly report writing.");
                break;
            case 6:
                System.out.println("Saturday: Personal projects, Learn new tools, Relaxing evening.");
                break;
            case 7:
                System.out.println("Sunday: Family time, Planning for the week, Light reading.");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }

        scanner.close();
    }
}
