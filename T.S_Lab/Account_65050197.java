public class Account_65050197 {
    public static void main(String[] args) {
        
    }
    
    class Account
    {
        int id;
        String name;
        public int balance = 0;
        Account (int id, String name, int balane)
        {
            getID(id);
            getName(name);
            getBalane(balane);
        }
        void getID(int id)
        {
            this.id = id;
        }
        void getName(String name)
        {
            this.name = name;
        }
        void getBalane(int balane)
        {
            this.balance = balane;
        }
        int credit(int amount)
        {
            this.balance += amount;
            return this.balance;
        }
        int debit(int amount)
        {
            if (this.balance >= amount)
            {
                this.balance -= amount;
            }
            return this.balance;
        }
        int transferTo(Account acc, int amount)
        {
            if (this.balance >= amount)
            {
                acc.balance += amount;
                this.balance -= amount;
            }
            return this.balance;
        }
        public String toString(){
            return String.format("Account %s(%d) balance is %d", name,id, balance);
        }
    }
}
