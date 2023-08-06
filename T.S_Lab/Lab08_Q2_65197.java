public class Lab08_Q2_65197 {
    public static void main(String[] args) {
        int[] ayy = {-2,-3,4,-1,-2,1,5,-8};
        System.out.println(kadene(ayy));
    }
    static int kadene(int[] ayy){
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for(int i : ayy){
            max_ending_here = max_ending_here+i;
            if(max_so_far<max_ending_here){
                max_so_far = max_ending_here;
            }
            if(max_ending_here<0){
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }
    
}
