import java.util.Scanner;

public class Lab7Q1_65197 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print(factorial(sc.nextInt()));
       sc.close();
    }
    public static int  factorial(int a){
        int ans = 1;
        if (a > 0){
            for (int i = 1; i <= a ; i++){
                ans *= i;
            }
            return(ans);
        }
        return(0);//หากใส่จนติดลบมามันหาค่าไม่ได้ เลยให้ return 0 
    }
}
