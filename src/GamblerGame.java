import java.util.Scanner;
public class GamblerGame {
    static int STAKE = 100;
    static int BET = 1;

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Game");
        int betAmount = 100;
        int playGame = 0;

        while (betAmount >40 && betAmount<100) {
            playGame++;
            int out = (int) (Math.random() * 2);
            if (out == 1) {
                System.out.println("You won the game");
                betAmount = betAmount +  BET;
                System.out.println("your balance is " + betAmount);
            } else {
                System.out.println("You lost the game");
                betAmount = betAmount - BET;
                System.out.println("Your remain" + betAmount);
            }

        }
        System.out.println("The number of time played are " + playGame);
    }

}
