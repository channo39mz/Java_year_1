import java.util.ArrayList;
import java.util.*;
// import java.util.Scanner;

public class Lab6Q2_265197 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        
        String[] sinp = inp.split("#");
        for (String i : sinp){
            list.add(i);
        }
        int num = 0;
        for (int i = 0; i < list.size() - 1; i++){
            
            if (!(list.get(i).equals(list.get(i+1)))){
                num += 1;
            }
        }
        if(num != 0){
            System.out.println(num+1);
        }
        else{
            System.out.println(1);
        }
        sc.close();

    }
    
}
