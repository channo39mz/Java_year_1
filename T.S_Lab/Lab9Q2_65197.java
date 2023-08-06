import java.util.Arrays;

public class Lab9Q2_65197 {
    public static void main(String[] args) {
        int[][] data = {
            {11 , 12 ,13,14},
            {15, 16, 17, 18},
            {19, 20, 21, 22},
            {23, 24, 25, 26},
            {27, 28, 29, 30}
        };
        int[][] hori = flipHori(data);
        for (int row = 0; row <data.length;row++){
            System.out.println(Arrays.toString(data[row]));
        }
        System.out.println('\n');
        for (int row = 0; row <data.length;row++){
            System.out.println(Arrays.toString(hori[row]));
        }
    }
    static int[][] flipHori(int[][] data){
        int[][] aft = new int[data.length][data[0].length];
        // System.out.println(Arrays.toString(data[0]));
        for (int i = 0; i<(data.length/2)+1; i++){
            aft[data.length - i -1] = data[i];
            aft[i] = data[data.length - i -1];
            // System.out.println(Arrays.toString(aft[data.length - i -1]));
        }

        return aft;
    }
    
}
