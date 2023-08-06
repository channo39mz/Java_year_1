import java.util.Arrays;

public class fianl {
    public static void main(String[] args) {
        delta();
    }
    static void delta() {
        int [] in = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; 
        int [] mse = new int [in.length + 1]; 
        mse[0] = 0; 
        for (int idx = 1; idx < mse.length; idx++) { 
        if (mse[idx - 1] > 0) { 
            // System.out.println(mse[idx - 1] + in[idx - 1]);
            mse[idx] = mse[idx - 1] + in[idx - 1]; 
        // System.out.println("if\t" + mse[idx]);
        } else { 
            System.out.println(in[idx - 1]);
            mse[idx] = in[idx - 1]; 
        // System.out.println("else\t" + mse[idx]);
        } 
        } 
        System.out.println(Arrays.toString(in));
        System.out.println(Arrays.toString(mse));
        printStartStop(in, mse); 
       } 
       static void printStartStop(int[] data, 
        int[] maxSumEndIdx) { 
        int max = maxSumEndIdx[1]; 
        int endAt = 1; 
        for (int idx = 2; idx < maxSumEndIdx.length; idx++) { 
            if (maxSumEndIdx[idx] > max) { 
                max = maxSumEndIdx[idx]; 
                endAt = idx; 
        } 
        } 
       int remaining = max; 
       int x;
        while (remaining > 0) { 
            x = data[endAt-1]; 
            System.out.print(x + ", "); 
            // System.out.print(remaining -= x); 
            // System.out.print(", "); 
            remaining -= x; 
            // System.out.print(remaining+"| "); 
            endAt--; 
        } 
        System.out.println("bye"); 
       }
}
