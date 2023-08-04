import java.util.ArrayList;

public class ArrayTestList {
    public static void main(String[] args) {
        ArrayList<AccountI> list = new ArrayList<>();
        AccountI da1 = new DepositAccount(1, 2);
        AccountI da2 = new DepositAccount(2, 1);

        list.add(da1);
        list.add(da2);

        AccountI getAccountI = list.get(0);
        System.out.println(getAccountI);

        /* for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        } */

        for(AccountI account : list){
            System.out.println(account);
        }

        boolean contains = list.contains(da1);
        if(list.contains(da1)){
            System.out.println("It does");
        }
    }
}
