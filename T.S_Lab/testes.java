import java.util.*;
public class testes {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        int[] a = {2,3,5};
        int[] b = {-2 , -4 , 0 ,2 , 3 ,8000};
        for(int i : a){
            arr.add(i);
        }
        System.out.println(arr);
        for(int j : b){
            arr.add(j);
        }
        arr.sort(null);
        System.out.println(arr);
        for(int L : arr){
            System.out.print(L);
            System.out.print(" ");
        }
    }
}
