import java.util.Scanner;

public class uc3 {

    public static int getUserInput() {
        Scanner sc = new Scanner(System.in);
        int slot;

        while (true) {
            System.out.print("Enter a slot number (1-9): ");
            slot = sc.nextInt();

            if (slot >= 1 && slot <= 9) {
                return slot;
            } else {
                System.out.println("Invalid input! Please enter between 1 and 9.");
            }
        }
    }

    public static void main(String[] args) {
        int userSlot = getUserInput();
        System.out.println("You selected slot: " + userSlot);
    }
}