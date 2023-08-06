package packA;

public class ProgrammerManager extends Programmer implements ManagerRoles{
    
    public ProgrammerManager(String name, int exp,int sal){
        super(name , exp , sal);
    }
    public void sayHi(){
        System.out.println("Coding in [solidity, typescript]");
    }
    public String coding(){
        return "FT_Java_lover";
    }
    public int evaluate(Programmer pro){
        int newsry = pro.getSalary()+(pro.getSalary()*15/100);
        // System.out.println(newsry);
        return (newsry);
    }
    
}
