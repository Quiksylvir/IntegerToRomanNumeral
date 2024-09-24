import java.util.HashMap;

public class IntegerToRomanNumeral {

    protected HashMap<Integer, String> integerMap = new HashMap<>();

    public String convertToRomanNumeral(int number) {
        integerMap.put(1, "I");
        return (String) integerMap.get(number);
    }
}
