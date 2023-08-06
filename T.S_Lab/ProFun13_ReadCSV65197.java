import java.util.*;
import java.io.IOException;
import java.nio.file.Paths;
public class ProFun13_ReadCSV65197{
    static Employee[] empList = new Employee[20];
    public static void main(String[] args) {
        int id;
        String firstName;
        String surName;
        double salary; 
        int idx = 0;
        int countLine = 0;
        try(Scanner input = new Scanner(Paths.get("employee.csv"))){
            while(input.hasNext()){
                int i = 0;
                countLine++;
                String row = input.nextLine();
                String[] data = row.split(",");
                try {
                    firstName = data[1];
                    surName = data[2];
                    id = Integer.parseInt(data[i]);
                    i += 3;
                    salary = Double.parseDouble(data[i]);

                    empList[idx] = new Employee(id,firstName,surName,salary);
                } 
                catch (IndexOutOfBoundsException e) {
                    System.out.println("\"Array is full - cannot load remaining rows\"");
                    return;
                }
                catch (NumberFormatException e) {
                    System.out.printf("Data format error at line: %d; java.lang.NumberFormatException: For input string: \"%s\"%n",countLine,data[i]);
                    continue;
                }
                idx++;
            }
        }
        catch(NumberFormatException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        printEmpList();
    }
    static void printAllEmployee(Employee[] a){
        System.out.println("id  firstname  surname  salary");
        try {
            for(int i=0;i<a.length-1;i++){
                System.out.println(a[i].getEmployeeInfo());
            }
        } catch (NullPointerException e) {
            return;
        }
    }
    static void  printEmpList(){
        System.out.println("id  firstname  surname  salary");
        try {
            for(int i=0;i<empList.length-1;i++){
                System.out.println(empList[i].getEmployeeInfo());
            }
        } catch (NullPointerException e) {
            return;
        }
    }
}

class Employee {
    private int empId;
    private String firstName, lastName;
    private double salary;
    public Employee() {
        this(0, "","", 0.0);
    }
    public Employee(int empId, String firstName, String lastName, double salary) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public int getEmpId() {
        return empId;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public String getEmployeeInfo() {
        return empId + " " + firstName + " " + lastName + " " + salary;
    }
}