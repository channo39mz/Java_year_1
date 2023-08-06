package packA;
import java.util.*;
public class Salesperson extends Employee implements SalesRoles{
    
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
    @Override
    public void setSalary(int incAmt){
        this.salary += incAmt;
    }
    public void setSalary(){
        this.salary *= 1.1;
    }
    public String makeQuotation(){
        Random rand = new Random();
        return(String.format("Dear value customer, %d is my best offer.",rand.nextInt(1000)));
    }
    public String toString()
    {
        return String.format("Programmer [name = %s, salary = %d, experience = %d]", getName(),salary, getExperience());
    }
    @Override
    public void sayHi(){
        System.out.print("Hi form sales person");
    }
  
}
