import packA.*;
import java.util.*;
public class Lab3 {
    public static void main(String[] args) {
        q1();
    }
    static void q1(){
        ArrayList<Employee> aList = new ArrayList<>();
        aList.add(new Accountant("goodAtmyJob",7,390,"sing"));
        aList.add(new Accountant("canRap",4,480,"rap"));
        aList.add(new Salesperson("mr.salesperson",5,150,5000));
        aList.add(new Salesperson("mr.kayan",3,260,9000));
        aList.add(new Programmer("keng",2,300));
        aList.add(new EmpTmp("imvisible",9,120));

        System.out.println("Upcasting");
        for (Employee e : aList){
            e.sayHi();
        }
        System.out.println();
        System.out.println("Downcasting");
        for (Employee e : aList){
            String str  = "";
            // System.out.println(e.getClass().getSimpleName());
            if (e.getClass().getSimpleName().equals("Accountant")){
                // System.out.println(((Accountant)e).tellProfit());
                str =  ((Accountant)e).tellProfit();
            }
            if (e.getClass().getSimpleName().equals("Programmer")){
                // System.out.println(((Accountant)e).tellProfit());
                str =  ((Programmer)e).coding();
            }
            if (e.getClass().getSimpleName().equals("Salesperson")){
                // System.out.println(((Accountant)e).tellProfit());
                str =  ((Salesperson)e).makeQuotation();
            }
           
            System.out.println(str);
        }
    }
}
