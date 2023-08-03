public class MainTest {
    public static void main(String[] args) {
        /* int age1 = 18;
        int age2 = 19;
        int age3 = 20; */

        int ages[] = new int[5];
        ages[2] = 25;
        System.out.println(ages[2]);

        int arrayLength = ages.length;
        System.out.println(ages.length);

        for(int i = 0; i < arrayLength; i++){
            System.out.println(ages[i]);
        }
    }
}
