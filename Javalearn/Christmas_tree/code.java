package Christmas_tree;
import java.util.Scanner;

class code {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int x = 1; x <= num ; x++ ){
            
            // System.out.print(x); 
            for (int nul = 0; nul<num-x ;nul++){
                System.out.print(" ");
            }

            for(int y = 0; y<x*2-1 ; y++ ){
                System.out.print("*");
            }
        System.out.println();


        }
        sc.close();

    }
}
