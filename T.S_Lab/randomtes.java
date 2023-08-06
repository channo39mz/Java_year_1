import java.util.Random;

public class randomtes {
    public static void main(String[] args) {
        Random ran = new Random(40);
        int number = ran.nextInt(0,1000000);
        System.out.printf("%06d" , number);
    }
    
}
