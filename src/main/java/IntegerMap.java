
import java.util.TreeMap;

public class IntegerMap {
    protected static TreeMap<Integer, String> integerMap = new TreeMap<>();
    static {
        integerMap.put(1, "I");
        integerMap.put(4, "IV");
        integerMap.put(5, "V");
        integerMap.put(9, "IX");
        integerMap.put(10, "X");
        integerMap.put(40, "XL");
        integerMap.put(50, "L");
        integerMap.put(90, "XC");
        integerMap.put(100, "C");
        integerMap.put(400, "CD");
        integerMap.put(500, "D");
        integerMap.put(900, "DM");
        integerMap.put(1000, "M");
    }
}
