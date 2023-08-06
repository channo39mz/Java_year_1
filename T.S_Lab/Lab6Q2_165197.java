import java.util.ArrayList;
import java.util.*;

public class Lab6Q2_165197 {
    public static void main(String[] args) {
        int [] data = {7,1,2,-1,3,4,10,-12,3,21,-9};
        ArrayList<Integer> newdata = new ArrayList<Integer>();
        for (int i : data){
            newdata.add(i);
        }
        System.out.println(Collections.max(newdata));
   
    }
    
}
