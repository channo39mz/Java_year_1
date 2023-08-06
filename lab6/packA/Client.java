package packA;
public class Client implements Canpay {
    private String name;
    private MemberTypeWithDiscount MenberType;
    public void spend(int mony){
        if(mony > 0){
            promoteMemberType();
        }
        else{
            demoteMemberType();
        }
        showMembershipStatus();
    }
    public Client(String name){
        this.name = name;
        this.MenberType = MenberType.NONE;
    }
    private void promoteMemberType(){
        if(MenberType == MenberType.NONE){
            this.MenberType = MenberType.SILVER;
        }
        else if(MenberType == MenberType.SILVER){
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
        System.out.println("you are now " + MenberType + (int) (MenberType.getpro()*10)+"%discount on Product " +(int) (MenberType.getser()*10)+"% on service");
    }
    
}
