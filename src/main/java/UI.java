import java.util.InputMismatchException;
import java.util.Scanner;

public class UI {
    public static void main(String[] args) {
        IntegerToRomanNumeral converter = new IntegerToRomanNumeral();
        Scanner inputToConvertToRomanNumeral = new Scanner(System.in);
        boolean proceed = false;
        while (!proceed) {
            try {
                System.out.print("Enter an integer to convert to Roman numeral(s): ");
                String romanNumerals = converter.convertToRomanNumeral(inputToConvertToRomanNumeral.nextInt());
                System.out.printf("Roman Numeral: %s", romanNumerals);
                proceed = true;
            } catch (InputMismatchException InputError) {
                System.err.println("\nPlease enter only integers");
                inputToConvertToRomanNumeral.next();
            }
        }
    }
}
