import java.util.ArrayList;
import java.util.List;

public class ArrayReviewTest {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int number = 40;
        Integer numberObject = new Integer(40);
        List<Integer> list = new ArrayList<Integer>();
        list.add(number); //autoboxing
        list.add(numberObject);
    }
}
