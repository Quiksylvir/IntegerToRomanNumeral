import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestIntegerToRomanNumeral {

    @Test
    public void TestConvert1toRomanNumeral() {
        IntegerToRomanNumeral converter = new IntegerToRomanNumeral();
        String result = converter.convertToRomanNumeral(1);
        Assertions.assertEquals(result, "I");
    }
}
