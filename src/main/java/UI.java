import java.util.InputMismatchException;
import java.util.Scanner;

public class UI {
    public static void main(String[] args) {
        IntegerToRomanNumeral converter = new IntegerToRomanNumeral();
        Scanner inputToConvertToRomanNumeral = new Scanner(System.in);

            System.out.print("Enter an integer to convert to Roman numeral(s): ");
            int userInput = verifyInput(inputToConvertToRomanNumeral);
            String romanNumerals = converter.convertToRomanNumeral(userInput);
            System.out.printf("\nRoman Numeral: %s\n", romanNumerals);

    }

    public static int verifyInput(Scanner input) {
        while (true) {
        try {
            return input.nextInt();
            } catch (InputMismatchException InputError) {
            System.err.println("\nPlease enter only integers");
            input.next();
            }
        }
    }
}
