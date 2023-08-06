package packA;
import java.util.*;

public class EmpTmp {
    protected String name;
    protected int salary;
    protected int experience;

    public EmpTmp(String n, int exp,int sal){
        this.name = n;
        this.salary = sal;
        this.experience = exp;
    }
    public EmpTmp(String n){
        this.name = n;
    }
    public EmpTmp(){

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public String toString()
    {
        return String.format("name = %s , salary = %d , experience = %d", name,salary, experience);
    }
    public void sayHi(){
        System.out.print("hi from Emp");
    }
}
