package packA;
import java.util.*;
public class Salesperson extends Programmer {
    
    private int target;
    public Salesperson(String n, int sal, int exp,int assignedtarget){
        super();
        setName(n);
        setSalary(sal);
        this.target = assignedtarget;
        setExperience(exp);
    }
    public Salesperson(String n, int exp){
        setName(n);
        setExperience(exp);
    }
    public void setTarget(int target) {
        this.target = target;
    }
    public int getTarget() {
        return target;
    }
    public void setSalary(){
        this.salary *= 1.1;
    }
    public void setSalary(int incresedAmount){
        this.salary += incresedAmount;
    }
    public String makeQuotation(){
        Random rand = new Random();
        return(String.format("Dear value customer, %d is my best offer.",rand.nextInt(1000)));
    }
    public String toString()
    {
        return String.format("Programmer [name = %s, salary = %d, experience = %d]", getName(),salary, getExperience());
    }
}
