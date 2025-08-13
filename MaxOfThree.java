import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number: ");
        int A = sc.nextInt();

        System.out.print("Enter second number: ");
        int B = sc.nextInt();

        System.out.print("Enter third number: ");
        int C = sc.nextInt();

        int max;

        // Logic using if-else
        if (A > B) {
            if (A > C) {
                max = A;
            } else {
                max = C;
            }
        } else {
            if (B > C) {
                max = B;
            } else {
                max = C;
            }
        }

        // Output the result
        System.out.println("The largest number is: " + max);

        sc.close();
    }
}
