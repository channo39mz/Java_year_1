import java.util.*;
public class Lab08_Q3_65197 {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,0,0,0,0,0};
        Scanner sc = new Scanner(System.in);
        while (true){
            int newnum = sc.nextInt();
            int cutn = 0;
            if(newnum <= 0){
                break;
            }
            if(arr[0] == 0){
                arr[0] = newnum;
                System.out.println(Arrays.toString(arr));
            }
            else if(newnum < arr[arr.length-1]){
                System.out.println(Arrays.toString(arr));
            }
            else{
                if(newnum >= arr[0]){
                    for(int i = 0 ; i<arr.length-1;i++){
                        arr[arr.length-i-1] = arr[arr.length-i-2];
                    }
                    arr[0] = newnum;
                    System.out.println(Arrays.toString(arr));
                }
                else if(newnum < arr[0]){
                    for(int z = 0 ; z<arr.length-1;z++){
                        if (newnum >= arr[z]){
                            for(int j = z ; j<arr.length-1;j++){
                                arr[arr.length-cutn-1] = arr[arr.length-cutn-2];
                                cutn++;
                            }
                            arr[z] = newnum;
                            break;
                        }
                        else if (newnum < arr[arr.length-2] && newnum > arr[arr.length-1]){
                            arr[arr.length-1] = newnum;
                            System.out.println(Arrays.toString(arr));
                        }
                    }
                    
                    System.out.println(Arrays.toString(arr));
                    
                }
            }
            
        }
        sc.close();
    }
}
