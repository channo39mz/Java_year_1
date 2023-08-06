import java.util.*;
public class Lab10Q2_65197 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,4,2};
        int i = 0;
        Scanner cn = new Scanner(System.in);
        int n = cn.nextInt();
        
        System.out.print(nub(arr,i,n));
        cn.close();
    }

    static int nub(int arr[] , int i , int n){
        // System.out.print(a);
        if(i == 6){
            return(0);
        }
        
        if (arr[i] == n){
            // System.out.print("a");
            // System.out.print("\n");
            return(nub(arr,i+1,n)) + 1;
        }
        return(nub(arr,i+1,n));
        
    }
}
