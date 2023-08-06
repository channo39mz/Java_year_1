import java.util.Scanner;
public class FtoC {
    public static void main(String[] args) {
        Scanner inP = new Scanner(System.in);
        float F = inP.nextFloat();
        inP.close();
        float C = ((F-32)/9)*5;
        System.out.println(C); 
        String a = "w";
    }
}
