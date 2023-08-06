package packA;
import java.util.*;

public class Programmer extends Employee{
    private ArrayList<String> skill = new  ArrayList<String>();
    private String name;
    protected int salary;
    private int experience;

    public Programmer(String name, int exp,int sal){
        this.name = name;
        this.experience = exp;
        this.salary = sal;
    }
    public Programmer(String name){
        this.name = name;
    }
    public Programmer(){

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return(this.name);
    }
    public void setSalary(int sal){
        this.salary = sal;
    }
    public int getSalary(){
        return(this.salary);
    }
    public void setExperience(int exp){
        this.experience = exp;
    }
    public int getExperience(){
        return(this.experience);
    }

    public String toString()
    {
        return String.format("Programmer [name = %s, salary = %d, experience = %d]", name,salary, experience);
    }
    @Override
    public void sayHi(){
        System.out.print("hi from"+name);
    }
    public String coding(){
        return String.format("FT_Love Java");
    }
}
