import java.util.ArrayList;
import java.util.List;

public class ArrayReviewTest {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int number = 40;
        // Wrapper
        //Integer numberObject = new Integer(40);
        Integer numberObject = Integer.valueOf(40);
        List<Integer> list = new ArrayList<Integer>();
        list.add(number); //autoboxing
        list.add(numberObject);

        //unboxing
        //int primitiveValue = numberObject;
        int primitiveValue = numberObject.intValue();

        byte byteInteger = numberObject.byteValue();
        double doubleInteger = numberObject.doubleValue();
        float floatInteger = numberObject.floatValue();

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
    }
}
