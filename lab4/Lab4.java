import java.util.ArrayList;

import packA.*;
public class Lab4 {
    public static void main(String[] args) {
        q1();
        System.out.println("----------------------------------------------------------------------");
        q2();
    }
    // static void q1(){
    //     Lec4Fish fish = new Lec4Fish();
    //     fish.swim();
    //     fish.fishMethod();

    //     Lec4Duck duck = new Lec4Duck();
    //     duck.swim();
    //     duck.duckMethod();
    // }
    static void q1(){
        ProgrammerManager pmanager = new ProgrammerManager("CoderReviewer",9,550);
        System.out.println(pmanager);
        Employee e = pmanager;
        e.sayHi();
    }
    static void q2(){
        ProgrammerManager pmanager = new ProgrammerManager("CoderReviewer", 9, 550);
        ArrayList<Programmer> aList = new ArrayList<>();
        aList.add(new Programmer("Keng",2,300));
        aList.add(new Programmer("Somsri",3,400));
        aList.add(new Programmer("haha",4,600));
        for (Programmer p : aList){
            int newSalary = pmanager.evaluate(p);
            System.out.println(newSalary);
        }
    }
}
