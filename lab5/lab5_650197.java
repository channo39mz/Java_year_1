import lab5.*;
import java.util.*;
public class lab5_650197 {
    static int[] data = { 28, 58, 8, 77, 48, 39 };
    static ArrayProcessor q1NumberOfEvenElement; // 4
    static ArrayProcessor q2IndexOfLargestEvenValue; // 1
    static ArrayProcessor myMedian; // n/2th element of sorted = 48
    public static void main(String[] args) {
        q1(); // 4
        q2(); // 1
        oneline(); // 48
    }
    
    static void oneline() {
        int[] tmp = Arrays.copyOf(data, data.length);
        Arrays.sort(tmp);
        myMedian = (data) -> {
            return(data[data.length/2]);
        };
        System.out.println(myMedian.calculate(tmp)); // 48
    }
    static void q1(){
        q1NumberOfEvenElement = (data) -> {
            int sum = 0;
            for(int i : data){
                if (i%2 == 0){
                    sum += 1;
                }
            }
            return(sum);
        };
        System.out.println(q1NumberOfEvenElement.calculate(data));
    }
    static void q2(){
        q2IndexOfLargestEvenValue = (data) -> {
            int index = 0;
            for (int i = 0; i < data.length; i++){
                if(data[i]%2 == 0){
                    if(data[i] > data[index]){
                        index = i;
                    }
                }
            }
            return(index);
        };
        System.out.println(q2IndexOfLargestEvenValue.calculate(data));
    }
    static void q3(){
        myMedian = (data) -> {
            return(data.length/2);
        };
        System.out.println(myMedian.calculate(data));
    }
}
