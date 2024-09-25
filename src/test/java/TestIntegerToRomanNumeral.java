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
    public void TestConvertIVtoRomanNumeral() {
        IntegerToRomanNumeral converter = new IntegerToRomanNumeral();
        String result = converter.convertToRomanNumeral(4);
        Assertions.assertEquals(result, "IV");
    }
}
