import java.util.Scanner;

public class n3_1Java {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int stk = 1;
        int ans = 0;
        int c = 0;
        while(a!= b){
            c = a;
            stk = 1;
            while(c!=1){
                if(c%2==0){
                    c /= 2;
                }
                else{
                    c = c*3+1;
                }
                stk += 1;
                // System.out.println(stk);
            }
            if(stk>ans){
                ans = stk;
            }
            a++;

        }

    System.out.println(ans);
    sc.close();
    }
}
