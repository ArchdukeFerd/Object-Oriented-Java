import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorterTest2 {
    public static void main(String[] args) {
        AccountI da1 = new DepositAccount(62, 33);
        Holder holderDA1 = new Holder();
        holderDA1.setName("Luis");
        da1.setHolder(holderDA1);
        da1.deposit(333);

        AccountI sa1 = new SavingsAccount(32, 44);
        Holder holderSA1 = new Holder();
        holderSA1.setName("González");
        sa1.setHolder(holderSA1);
        sa1.deposit(444);

        AccountI da2 = new DepositAccount(22, 11);
        Holder holderDA2 = new Holder();
        holderDA2.setName("Fernando");
        da2.setHolder(holderDA2);
        da2.deposit(111);

        AccountI sa2 = new SavingsAccount(2, 22);
        Holder holderSA2 = new Holder();
        holderSA2.setName("Avila");
        sa2.setHolder(holderSA2);
        sa2.deposit(222);

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
        //Comparator<AccountI> comparator = new accountNumberSorter();
        //list.sort(comparator);
        list.sort(new Comparator<AccountI>() {

            @Override
            public int compare(AccountI o1, AccountI o2) {
                return Integer.compare(o1.getNumber(),o2.getNumber());
            }
            
        });

        System.out.println("After sorting");
        
        for(AccountI account : list){
            System.out.println(account);
        }

        //Comparator<AccountI> holderNamecComparator = new holerNameSorter();
        /*list.sort(new holderNameSorter());
        
        System.out.println("After sorting by holder name");
        
        for(AccountI account : list){
            System.out.println(account);
        }*/

        Collections.sort(list, new Comparator<AccountI>() {

            @Override
            public int compare(AccountI o1, AccountI o2) {
                return o1.getHolder().getName().compareTo(o2.getHolder().getName());
            }
            
        });
        System.out.println("After sorting by holder name");
        
        for(AccountI account : list){
            System.out.println(account);
        }

        Collections.sort(list);
        System.out.println("After sorting by natural order");
        
        for(AccountI account : list){
            System.out.println(account);
        }
    }
}


//This has been already implemented above
/*class accountNumberSorter implements Comparator<AccountI> {

    @Override
    public int compare(AccountI o1, AccountI o2) {
        //Basic method
        if(o1.getNumber() == o2.getNumber()){
            return 0;
        }
        else if(o1.getNumber() > o2.getNumber()){
            return 1;
        }
        else {
            return -1;
        }

        //Medium method
        return o1.getNumber()-o2.getNumber();

        //Wrapper method
        return Integer.compare(o1.getNumber(),o2.getNumber());
    }

}

class holderNameSorter implements Comparator<AccountI>{

    @Override
    public int compare(AccountI o1, AccountI o2) {
        return o1.getHolder().getName().compareTo(o2.getHolder().getName());
    }
}*/
