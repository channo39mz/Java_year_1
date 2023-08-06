import java.util.*;
public class AcctList_65050197{
        public static void main(String[] args) {
        Allacout clients = new Allacout();
        char startWith = 'c';
        System.out.println("List of account name start with " + startWith);
        System.out.println();
        for (Account N : clients.filterName(startWith)){
            System.out.println(N.toString());
        }
        System.out.println();

        int bound = 1400;
        System.out.println("List of account balance less than " + bound); //ArrayList
        for (Account L : clients.balanceLessThan(bound)){
            System.out.println(L.toString());
        }
    }
}
    class Allacout
    {
        Scanner sc = new Scanner(System.in);
        List<Account> list = new ArrayList<Account>();
        List<Account> list2 = new ArrayList<Account>();
        Allacout()
        {
            makeAcc();
        }
        void add(Account acc)
        {
            list.add(acc);
        }
        void makeAcc()
        {
            for(int i = 0; i < 5; i++)
            {
                Account ac = new Account(sc.next(), sc.nextInt());
                add(ac);
            }
            for (Account a : list)
            {
                System.out.println(a.toString());
            }
        }
        List<Account> filterName(char a)
        {
            list2.clear();
            for (Account k : list)
            {
                // System.out.print(k.name.charAt(0));
                if (a == k.name.charAt(0))
                {
                    list2.add(k);
                }
            }
            return list2;
        }
        List<Account> balanceLessThan(int num)
        {
            list2.clear();
            for (Account k  : list)
            {
                if (k.balance < num){
                    list2.add(k);
                }
            }
            return list2;
        }
      
    }
    class Account
    {
        String name;
        public int balance = 0;
        Account (String name, int balane)
        {
            this.name = name;
            this.balance = balane;
        }
        public String toString(){
            return String.format("name %s balance is %d", name, balance);
        }
    }

