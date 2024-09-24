import java.util.HashMap;

public class RomanNumeralMap {
    protected final static HashMap<Integer, String> romannumeralhashMap = new HashMap<Integer, String>();

    static {

        romannumeralhashMap.put(1000, "M");
        romannumeralhashMap.put(900, "CM");
        romannumeralhashMap.put(500, "D");
        romannumeralhashMap.put(400, "CD");
        romannumeralhashMap.put(100, "C");
        romannumeralhashMap.put(90, "XC");
        romannumeralhashMap.put(50, "L");
        romannumeralhashMap.put(40, "XL");
        romannumeralhashMap.put(10, "X");
        romannumeralhashMap.put(9, "IX");
        romannumeralhashMap.put(5, "V");
        romannumeralhashMap.put(4, "IV");
        romannumeralhashMap.put(1, "I");

    }
}
