import java.util.*;
public class arcane9 {
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
  
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }
    public static void main(String[] args) {
        int[][] arr = new int[8][8];
        Scanner sc = new Scanner(System.in);

        String posi = sc.nextLine();
        String[] a = posi.split(" ",2);
        int x = Integer.parseInt(a[0])-1;
        int y = Integer.parseInt(a[1])-1;
        String move =  sc.nextLine();
        int wal = 2;
        int nub  = 0;
        boolean tag00 = false;
        boolean tag07 = false;
        boolean tag70 = false;
        boolean tag77 = false;
      
        if (move.length() % 2 == 0){
            wal = 3;
        }
        sc.close();
        move = move.toLowerCase();
        for (int i = 0; i < move.length(); i++){
            try{
                
                if (move.charAt(i) == 'a')
                {
                    for (int j = 0; j < wal; j++){
                        y--;
                        arr[x][y] = 1;
                    }
                }
                if (move.charAt(i) == 'w')
                {
                    for (int j = 0; j < wal; j++){
                        // System.out.printf("%d %d |",x,y);
                        x--;
                        arr[x][y] = 1;
                    }
                }
                if (move.charAt(i) == 's')
                {
                    for (int j = 0; j < wal; j++){
                        x++;
                        arr[x][y] = 1;
                    }
                }
                if (move.charAt(i) == 'd')
                {
                    for (int j = 0; j < wal; j++){
                        y++;
                        arr[x][y] = 1;
                    }
                }
            }
            catch(Exception e){
                if (move.charAt(i) == 'a')
                {
                    y++;
                }
                if (move.charAt(i) == 'w')
                {
                    x++;
                }
                if (move.charAt(i) == 's')
                {
                    x--;
                }
                if (move.charAt(i) == 'd')
                {
                    y--;
                }
                // System.out.printf("%d %d |",x,y);
                System.out.print("Ah!");
                if (x == 0 && y == 0)
                {
                    tag00 = true;
                }
                if (x == 0 && y == 7)
                {
                    tag07 = true;
                }
                if (x == 7 && y == 0)
                {
                    tag70 = true;
                }
                if (x == 7 && y == 7)
                {
                    tag77 = true;
                }
                nub++;
            }
        }
        if (isPrime(nub) && tag00 && tag07 && tag70 && tag77)
        {
            System.out.println();
            System.out.println("Tamuikri!");
        }
    }
}
