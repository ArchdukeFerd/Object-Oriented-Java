public class Wrapperstest {
    public static void main(String[] args) {
        Double doubleNumber = 33.0; //autoboxing
        Boolean truth = true; //autoboxing
        Double doubleNumber2 = Double.valueOf(33);

        System.out.println(doubleNumber2);

        String stringNumber = "43";
        Double stringToDouble = Double.valueOf(stringNumber);
        Integer stringToInteger = Integer.valueOf(stringNumber);

        System.out.println(stringToDouble);
        System.out.println(stringToInteger);

        Number number = Integer.valueOf(5);
        double primDoublenumber = number.doubleValue();

        Boolean untrue = Boolean.FALSE;
    }
}
