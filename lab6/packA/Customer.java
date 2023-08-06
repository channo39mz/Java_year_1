package packA;

public class Customer implements Canpay{
    private String name;
    private MemberType MenberType;

    public void spend(int mony){
        if(mony > 0){
            promoteMemberType();
        }
        else{
            demoteMemberType();
        }
        showMembershipStatus();
    }
    public Customer(String name){
        this.name = name;
        this.MenberType = MenberType.SILVER;
    }
    private void promoteMemberType(){
        if(MenberType == MenberType.NONE){
            this.MenberType = MenberType.SILVER;
        }
        if(MenberType == MenberType.SILVER){
            this.MenberType = MenberType.GOLD;
        }
        else if(MenberType == MenberType.GOLD){
            this.MenberType = MenberType.PREMIUM;
        }
    }
    private void demoteMemberType(){
        if(MenberType == MenberType.PREMIUM){
            this.MenberType = MenberType.GOLD;
        }
        else if(MenberType == MenberType.GOLD){
            this.MenberType = MenberType.SILVER;
        }
    }
    public void showMembershipStatus(){
        System.out.printf("you are now " + MenberType + '\n');
    }
}
