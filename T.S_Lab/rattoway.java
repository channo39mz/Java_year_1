import java.util.*;
public class rattoway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> avail = new LinkedList<Integer>();
        int n = sc.nextInt();
        int[] contractYears = new int[n];
        for (int i = 0; i < n; i++)
            contractYears[i] = sc.nextInt();
        int startYear = sc.nextInt();
        int y = sc.nextInt();
        int[] checkYears = new int[y];
        for (int i = 0; i < y; i++)
            checkYears[i] = sc.nextInt();
        sc.close();
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < n; j++)
                if(checkYears[i] >= startYear+contractYears[j])
                    avail.offer(j+1);
            if(avail.isEmpty())
                System.out.print("full");
            while(!avail.isEmpty()){
                System.out.print(avail.poll());
                if(!avail.isEmpty())
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
