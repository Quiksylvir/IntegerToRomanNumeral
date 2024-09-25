
public class IntegerToRomanNumeral {


    protected String convertToRomanNumeral(int number) {
            int closestKey = getClosestKey(number);
            if (checkIfExactToKey(number, closestKey) != null) {
                return checkIfExactToKey(number, closestKey);
            } else {
                return buildRomanNumeralString(number, closestKey).toString();
            }
    }

    private int getClosestKey(int number) {
        return IntegerMap.integerMap.floorKey(number);
    }

    private StringBuilder buildRomanNumeralString(int number, int closestKey) {
            StringBuilder romanNumeralString = new StringBuilder();
            while (true) {
                romanNumeralString.append(IntegerMap.integerMap.get(closestKey));
                number -= closestKey;
                if (number == 0) {
                    break;
                }
                closestKey = IntegerMap.integerMap.floorKey(number);
            }
            return romanNumeralString;
    }

    private String checkIfExactToKey(int number, int closestKey) {
        if (number == closestKey) {
            return IntegerMap.integerMap.get(number);
        } else {
            return null;
        }
    }
}
