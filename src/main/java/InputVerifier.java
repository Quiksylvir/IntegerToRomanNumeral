import java.util.InputMismatchException;
import java.util.Scanner;

public class InputVerifier {

    protected static int verifyInput(Scanner input) {
        while (true) {
            try {
                    int inputInt = input.nextInt();
                    if (verifyInputIsInRange(inputInt)) {
                        return inputInt;
                    }
            } catch (InputMismatchException InputError) {
                System.err.println("\nPlease enter only integers");
                input.next();
            }
        }
    }

    private static boolean verifyInputIsInRange(int inputInt) {
        if(inputInt < 0) {
            System.err.println("Please enter a positive integer.");
            return false;
        } else if (inputInt > 3999) {
            System.err.println("Please enter an integer between 1 and 3000.");
            return false;
        }else {
            return true;
        }
    }

}
