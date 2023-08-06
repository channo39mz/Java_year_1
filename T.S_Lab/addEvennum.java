import java.util.*;
public class addEvennum {
    public static void main(String[] args) {
        Scanner inP = new Scanner(System.in);
        float sum = 0;
        while(true){
            Float get = inP.nextFloat();
            if (get <= 0){
                break;
            }
            if (get%2 == 0){
                sum+= get;//
            }
            System.out.println(sum);
        }   
        inP.close();
    }
}
