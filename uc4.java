import java.util.Scanner;

public class uc4 {

    // Method to convert slot to row and column
    public static int[] convertSlotToIndex(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        return new int[]{row, col};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter slot (1-9): ");
        int slot = sc.nextInt();

        int[] position = convertSlotToIndex(slot);

        System.out.println("Row: " + position[0]);
        System.out.println("Column: " + position[1]);
    }
}