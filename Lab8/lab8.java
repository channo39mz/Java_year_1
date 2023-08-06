import java.util.*;
import java.util.function.Consumer;

import javax.lang.model.element.Element;

interface HalfValueInter{
    void printHalf(int n);
}
class NumberPrecessor{
    public void printHalf (int n){
        System.out.println(n/2);
    };
}
class singer{
    private String name;
    private String stly = "cool";
    singer(){

    }
    singer(String n){
        this.name = n;
    }
    public void setsty(String sty){
        this.stly = sty;
    }
    public String getName(){
        return(name);
    }
    public String getStyle(){
        return(stly);
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("singer (%s.style.%s)", getName(),getStyle());
    }
}


public class lab8 {
    public static void main(String[] args) {
        q1_halfEachNumber();
        q2_forEachSingerName();
        q3_lambda_comparator();
        q4_method_reference_comparator();
    }
    public void printHalf(int n){
        System.out.println(n/2);
    }
    public static void q1_halfEachNumber(){
        List<Integer> nums = Arrays.asList(100 , 105);

        HalfValueInter halfVal = (n) -> {
            System.out.println(n/2);
        };
        for (int n : nums){
            halfVal.printHalf(n);
        }
        Consumer<Integer> consumer = n -> {
           int ans = n/2;
           System.out.println(ans);
        }; 
        for (int n : nums){
            consumer.accept(n);
        }
        Consumer<Integer> halfMe = n -> System.out.println(n/2);
        nums.forEach(halfMe);
        nums.forEach(consumer = (n) -> {System.out.println(n/2);});

        NumberPrecessor np = new NumberPrecessor();
        nums.forEach(np::printHalf);
    }

    public static void q2_forEachSingerName(){
        ArrayList<singer> singerList = new ArrayList<>();
        singer a = new singer("rr");
        singer b = new singer("hh");
        singerList.add(b);
        singerList.add(a);
        singerList.stream().map(element -> element.getName()).forEach(System.out::println);
        
        singerList.stream().map(singer::getName).forEach(System.out::println);
    }

    public static void q3_lambda_comparator() {
        ArrayList<singer> singerList = new ArrayList<>();
        singer a = new singer("rr");
        singer b = new singer("hh");
        singer c = new singer("ll");
        a.setsty("Lalin");
        b.setsty("stacool");
        c.setsty("A");
        singerList.add(b);
        singerList.add(a);
        singerList.add(c);
        Comparator<singer> byStyle1 = new Comparator<>() {
         @Override
         public int compare(singer o1, singer o2) {
         return o1.getStyle().compareTo(o2.getStyle());
        }
        };
        Collections.sort(singerList, byStyle1);
        singerList.forEach(System.out::println);
        Comparator<singer> byStyle2 = (o1,o2) ->  o1.getStyle().compareTo(o2.getStyle()); 

        Collections.sort(singerList, byStyle2);
       
        singerList.forEach(System.out::println);
    };
    public static void q4_method_reference_comparator() {
        ArrayList<singer> singerList = new ArrayList<>();
        singer a = new singer("rr");
        singer b = new singer("hh");
        singer c = new singer("ll");
        a.setsty("Lalin");
        b.setsty("stacool");
        c.setsty("A");
        singerList.add(b);
        singerList.add(a);
        singerList.add(c);
        Comparator<singer> byName = Comparator.comparing(singer :: getName);
        Collections.sort(singerList, byName);
        singerList.forEach(System.out::println);
        System.out.println("--------");

        
        Collections.sort(singerList, Comparator.comparing(singer :: getStyle));
        singerList.forEach(System.out::println);
    }
}