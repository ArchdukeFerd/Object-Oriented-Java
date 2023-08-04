public class ObjectSaverTest {
    public static void main(String[] args) {
        ObjectSaver objectSaver = new ObjectSaver();
        AccountI da = new DepositAccount(1, 2);
        objectSaver.add(da);
        AccountI da2 = new DepositAccount(3, 4);
        objectSaver.add(da2);

        objectSaver.get(1);
        System.out.println(objectSaver.get(0));
        System.out.println(objectSaver.get(1));
    }
}
