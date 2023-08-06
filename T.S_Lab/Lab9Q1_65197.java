import java.util.Arrays;

public class Lab9Q1_65197 {
    public static void main(String[] args) {
        int[] data = {0,1,0,1,1,0,0,1,0};
        shake(data);
        System.out.println(Arrays.toString(data));
    }

    static int[] shake(int[] data){
        int num = 0;
        for (int i : data){
            if(i == 0){
                num += 1;
            }
        }
        for (int j = 0; j< data.length;j++ ){
            if(num!=0){
                data[j] = 0;
                num--;
            }
            else{
                data[j] = 1;
            }
        }
        return data;
    }
}
