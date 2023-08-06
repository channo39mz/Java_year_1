import java.util.Arrays;

public class Lab10Q3_65197 {
    public static void main(String[] args) {
        int i = 0;
        int arr[] = {1,-2, 3, 4, -5};
        System.out.println(Arrays.toString(make0(arr,i)));
    }

    static int[] make0(int arr[],int i){
        if(i==5){
            return(arr);
        }
        if(arr[i] < 0){
            arr[i] = 0;
        }
        return(make0(arr,i+1));
    }
    
}
