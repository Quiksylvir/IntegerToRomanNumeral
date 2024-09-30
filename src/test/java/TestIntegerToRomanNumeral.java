import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestIntegerToRomanNumeral {

    @Test
    public void TestConvert1toRomanNumeral() {
        IntegerToRomanNumeral converter = new IntegerToRomanNumeral();
        String result = converter.convertToRomanNumeral(1);
        Assertions.assertEquals(result, "I");
    }

    @Test
    public void TestConvert3toRomanNumeral() {
        IntegerToRomanNumeral converter = new IntegerToRomanNumeral();
        String result = converter.convertToRomanNumeral(3);
        Assertions.assertEquals(result, "III");
    }

    @Test
    public void TestConvert4toRomanNumeral() {
        IntegerToRomanNumeral converter = new IntegerToRomanNumeral();
        String result = converter.convertToRomanNumeral(4);
        Assertions.assertEquals(result, "IV");
    }

    @Test
    public void TestConvert5toRomanNumeral() {
        IntegerToRomanNumeral converter = new IntegerToRomanNumeral();
        String result = converter.convertToRomanNumeral(5);
        Assertions.assertEquals(result, "V");
    }

    @Test
    public void TestConvert9toRomanNumeral() {
        IntegerToRomanNumeral converter = new IntegerToRomanNumeral();
        String result = converter.convertToRomanNumeral(9);
        Assertions.assertEquals(result, "IX");
    }

    @Test
    public void TestConvert10toRomanNumeral() {
        IntegerToRomanNumeral converter = new IntegerToRomanNumeral();
        String result = converter.convertToRomanNumeral(10);
        Assertions.assertEquals(result, "X");
    }

    @Test
    public void TestConvert57toRomanNumeral() {
        IntegerToRomanNumeral converter = new IntegerToRomanNumeral();
        String result = converter.convertToRomanNumeral(57);
        Assertions.assertEquals(result, "LVII");
    }

    @Test
    public void TestConvert2999toRomanNumeral() {
        IntegerToRomanNumeral converter = new IntegerToRomanNumeral();
        String result = converter.convertToRomanNumeral(2999);
        Assertions.assertEquals(result, "MMCMXCIX");
    }
}
