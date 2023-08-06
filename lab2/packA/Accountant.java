package packA;
import java.util.*;

public class Accountant extends Programmer{
    private static String companyName =  "berk barn jamkad";
    private int experience;
    private String specialty;
    private int superExp;
    
    public Accountant(String name,int superExp, int experience, int sal,String talent){
        super();
        setName(name);
        setSalary(sal);
        this.superExp = superExp;
        this.specialty =  talent;
        setExperience(experience);
        
    }
    public Accountant(){
        
    }
    public void setSpecialy(String special){
        this.specialty = special;
    }
    public String getSpecialy(){
        return this.specialty;
    }
    public void setAccountExperience(int exp){
        this.experience = exp;
    }
    public int getAccountExperience(){
        return this.experience;
    }
    public String tellProfit(){
        Random rand = new Random();
        return String.format("%s's profit is %d. My salary is %d",companyName,rand.nextInt(1000),getSalary());
    }
   
    @Override
    public void sayHi(){
        Random rand = new Random();
        System.out.println(String.format("%s's profit is %d. My salary is %d",companyName,rand.nextInt(1000),getSalary()));
    }
    @Override
    public String toString()
    {
        return String.format("%s %d %d can %s",getName(),this.superExp,getExperience(),this.specialty);
    }
    public static String tellMyRole() {
        return "I am an accountant at %d"+ companyName;
    }

}
