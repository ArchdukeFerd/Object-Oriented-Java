import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSorterTest {
    public static void main(String[] args) {
        AccountI da1 = new DepositAccount(22, 33);
        da1.deposit(333.0);

        AccountI sa1 = new SavingsAccount(22, 44);
        sa1.deposit(444.0);

        AccountI da2 = new DepositAccount(22, 11);
        da2.deposit(111.0);

        AccountI sa2 = new SavingsAccount(22, 22);
        sa2.deposit(222.0);

        List<AccountI> list = new ArrayList<>();
        list.add(da1);
        list.add(sa1);
        list.add(da2);
        list.add(sa2);
        
        System.out.println("Before sorting");
        
        for(AccountI account : list){
            System.out.println(account);
        }

        //Arranging Accounts
        //           Any child class from AccountI
        //Comparator <? extend AccountI> c
        Comparator<AccountI> comparator = new accountNumberSorter();
        list.sort(comparator);

        System.out.println("After sorting");
        
        for(AccountI account : list){
            System.out.println(account);
        }
    }
}

class accountNumberSorter implements Comparator<AccountI> {

    @Override
    public int compare(AccountI o1, AccountI o2) {
        if(o1.getNumber() == o2.getNumber()){
            return 0;
        }
        else if(o1.getNumber() > o2.getNumber()){
            return 1;
        }
        else {
            return -1;
        }
    }

}
