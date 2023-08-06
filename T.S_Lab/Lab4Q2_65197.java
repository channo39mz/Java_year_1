
import java.util.*;


public class Lab4Q2_65197 {
    public static void main(String[] args) {
        ArrayList<Integer> allnum = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            int num = sc.nextInt();
            allnum.add(num);
        }
        // System.out.println(allnum);
        allnum.remove(Collections.min(allnum));
        
        // System.out.println(allnum);
        System.out.println(allnum.get(0)+allnum.get(1));
        sc.close();
    }
    
}
