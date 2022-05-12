import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Functions.ClearScreen();
        // Generate Random Number between 1-100
        Random rand = new Random();
        int number = rand.nextInt(101);
        while (true) {
            int input = Functions.Input();

            // An if statement to check if the user input is correct/bigger/smaller
            if (input == number) {
                System.out.println("You win!");
                break;
            } else if (input > number) {
                System.out.println("Too big");
            } else if (input < number) {
                System.out.println("Too small");
            }
        }
    }
}
