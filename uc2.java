import java.util.Random;

public class uc2 {
    public static void main(String[] args) {

        Random rand = new Random();

        int toss = rand.nextInt(2); // 0 or 1

        String player1 = "Player 1";
        String player2 = "Player 2";

        char symbol1, symbol2;
        String currentPlayer;

        if (toss == 0) {
            currentPlayer = player1;
            symbol1 = 'X';
            symbol2 = 'O';
        } else {
            currentPlayer = player2;
            symbol2 = 'X';
            symbol1 = 'O';
        }

        System.out.println("Toss Result: " + toss);
        System.out.println(currentPlayer + " starts first!");
        System.out.println(player1 + " symbol: " + symbol1);
        System.out.println(player2 + " symbol: " + symbol2);
    }
}