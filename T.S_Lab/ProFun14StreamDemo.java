import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.*;

public class ProFun14StreamDemo {
    ArrayList<ProFun14Employee> eList;

    ProFun14StreamDemo(){
        Scanner sc = new Scanner(System.in);
        eList = new ArrayList<>();
        int r = Integer.valueOf(sc.nextLine());
        for (int t = 0; t< r; t++){
            String wa = sc.nextLine();
            String[] wa2 = wa.split(" ");
            
            eList.add(new ProFun14Employee(wa2[0], wa2[1], Integer.valueOf(wa2[2]), Integer.valueOf(wa2[3])));
        }
        sc.close();
        // eList.add(new ProFun14Employee("D", "HR", 9000, 2016));
        // eList.add(new ProFun14Employee("B", "IT", 5000, 2011));
        // eList.add(new ProFun14Employee("C", "IT", 6000, 2014));
        // eList.add(new ProFun14Employee("A", "Finance", 7000, 2018));
    }
    void oldWay(){
        String Query = "Q1 list contains all employee's name";
        // System.out.println(eList.toString());
        ArrayList<String> a1 = new ArrayList<String>();
        for (ProFun14Employee a : eList){
            a1.add(a.getName());
        }
        // System.out.println(a1);
        ArrayList<ProFun14Employee> a2 = new ArrayList<ProFun14Employee>();
        for (ProFun14Employee b : eList)
        {
            if (b.getyear() < 2015){
                a2.add(b);
            }
        }
        System.out.println(a2);
        int a3 = 0;
        int salmon = 99999;
        ArrayList<String> cop = new ArrayList<String>();
        for (ProFun14Employee c : eList)
        {
            a3 += c.getsalary();
            if (c.getyear() < salmon){
                salmon = c.getyear();
            }
            cop.add(c.getdept());
        }
        System.out.println(a3);
        for (ProFun14Employee d : eList)
        {
            if (d.getyear() == salmon){
                System.out.println(d.toString());
            }
        }
        ArrayList<ProFun14Employee> a5 = new ArrayList<ProFun14Employee>();
        ArrayList<String> Truecop = new ArrayList<String>();
        Collections.sort(cop);   
        // int nub = 0;
        // for (int i = 0; i< cop.size(); i++){
        //     for(int j = i+1; j < cop.size(); j++){
        //         if(cop.get(i).equals(cop.get(j))){
        //             Truecop.add(cop.get(i));
        //         }
        //     }
        // }
        // System.out.print(Truecop);




    }
    public static void main(String[] args) {
        ProFun14StreamDemo demo = new ProFun14StreamDemo();
        // System.out.println(demo.eList.toString());
        demo.oldWay();
    }
}
class ProFun14Employee{
    String name;
    String dept;
    int salary;
    int yearStart;

    ProFun14Employee(String n, String d, int sal, int yr)
    {
        name = n;
        dept = d;
        salary = sal;
        yearStart = yr;
    }
    public String getName() {
        return name;
    }
    public String getdept(){
        return dept;
    }
    public int getsalary(){
        return salary;
    }
    public int getyear(){
        return yearStart;
    }

    public String toString()
    {
        return String.format("%s %s (%d) %d", dept, name, salary, yearStart);
    }
}
