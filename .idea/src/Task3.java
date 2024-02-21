import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your password: ");
        String password = sc.nextLine();

        password.matches("((?=.*[A-Z])(?=.*\\d).{8,})");

        System.out.println("Result: " + password);
    }
}
