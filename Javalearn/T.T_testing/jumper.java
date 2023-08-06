import java.util.Scanner;
import java.util.*;

public class jumper {
    public static void main(String[] args) {
        List<Integer> jumper = new ArrayList<Integer>();
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String[] jump = str.split(" ");
        int count1 = 0;
        int count2 = 0;
        int notjoy = 0;

        for (String i : jump){
            jumper.add(Integer.parseInt(i));
        }
        jumper.remove(jumper.get(0));
        // System.out.println(jumper);
        for (int i = 0; i < jumper.size() - 2; i++){
            
           
            if (jumper.get(i)>jumper.get(i+1)){
                count1 = jumper.get(i)-jumper.get(i+1);
            }
            if (jumper.get(i)<=jumper.get(i+1)){
                count1 = jumper.get(i+1)-jumper.get(i);
            }
            if (jumper.get(i+1)>jumper.get(i+2)){
                count2 = jumper.get(i+1)-jumper.get(i+2);
            }
            if (jumper.get(i+2)>=jumper.get(i+1)){
                count2 = jumper.get(i+2)-jumper.get(i+1);
            }
            
            if (count1 - count2 > 1 || count2 - count1 > 1 || count1 == count2 || count2 > count1){
                // System.out.println(count1);
                // System.out.println(count2);
                notjoy += 1; 
            }
            
        }
        if(notjoy == 0){
            // System.out.println(notjoy);
            System.out.println("Jolly");
        }
        else{
            // System.out.println(notjoy);
            System.out.println("Not Jolly");
        }

        scn.close();
    }
    
}
