public class StringTest {
    public static void main(String[] args) {
        String name = "test";
        // String name2 = new String("test");
        System.out.println(name);
        name = name.replace("t", "T");
        name = name.concat(" of replacements");
        name = name.toUpperCase();
        name = name.toLowerCase();
        char letter = name.charAt(1);
        System.out.println(name);
        System.out.println(letter);
    }
}
