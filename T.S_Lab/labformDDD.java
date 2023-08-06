import java.util.*;

public class labformDDD {
    public static void main(String[] args){
        double input = readDouble();
        System.out.printf(""+"%.2f   %.2f",input,taxRate(input));
    }
    static double readDouble(){
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        sc.close();
        return(num);
    }  
    static double taxRate(double n){
        if (n<100000){
            return(0.00);
        }
        else if (n>=100000 && n< 500000){
            return(5.00);
        }
        else if (n>=500000 && n < 1000000){
            return(10.00);
        }
        else{
            return(15.0);
        }

  
    }
    
}
