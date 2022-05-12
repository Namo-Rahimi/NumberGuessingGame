import java.util.Scanner;
public class Functions {
    //To clear the screen/terminal
    public static void ClearScreen() {
        try {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {

        }
    }
    // Input Function to get the user input
    public static int Input() {
        Scanner scan = new Scanner(System.in);
        // In a loop so if the user enters a letter to will just ask again.
        while (true) {
            System.out.print("Enter a number: ");
            String input = scan.next();
            int inputValue = 0;
            try {
                inputValue= Integer.parseInt(input);
                return inputValue;
            } catch (NumberFormatException ex) {
                System.out.println("This is not a number");
            }
        }
    }
}