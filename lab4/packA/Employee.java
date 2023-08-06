package packA;
import java.util.*;

public abstract class Employee {
    protected String name;
    protected int salary;
    protected int experience;

    public Employee(String n, int exp,int sal){
        this.name = n;
        this.salary = sal;
        this.experience = exp;
    }
    public Employee(String n){
        this.name = n;
    }
    public Employee(){

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
    public abstract void sayHi();
}
