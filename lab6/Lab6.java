import packA.*;

public class Lab6 {
    public static void main(String[] args) {
        q1();
        q2();
        q3();
    }    
    static void q1()
    {
    int[] monthly = { 1,1,1,1,1,-1,-1,1,-1};
    Customer yindee = new Customer("Yindee");
    for (int i = 0; i < monthly.length; i++){
        yindee.spend(monthly[i]);
    }
    }
    static void q2()
    {
        int[] monthly = { 1,1,1,1,1,-1,-1,1,-1};
        Client yindee = new Client("Yindee");
        for (int i = 0; i < monthly.length; i++){
            yindee.spend(monthly[i]);
        }
    }
    static void q3()
    {
        MemberTypeWithDiscount q = MemberTypeWithDiscount.GOLD;
        MemberTypeWithDiscount p = MemberTypeWithDiscount.GOLD;
        System.out.println(q == p);
    }
}
