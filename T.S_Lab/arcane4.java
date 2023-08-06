import java.util.*;
public class arcane4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] map = new int[x][y];
        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                map[i][j] = sc.nextInt();
            }
        }
        //System.out.println(Arrays.toString(map[0]));
        int stx = sc.nextInt();
        int sty = sc.nextInt();
        
        // int nub = 0;
        stx -= 1;
        sty -= 1;
        while(map[stx][sty] == 0)
        {
            if (stx == x-1 && sty == y-1)
            {
                stx = 0;
                sty = 0;
            }
            if (sty == y-1)
            {
                stx++;
                sty = 0;
            }
            else{
                sty++;
            }
        }
        int ans1 = map[stx][sty];
        map[stx][sty] = 0;
        System.out.println(ans1);
        System.out.printf("%d %d\n",stx+1,sty+1);
        for (int l = 0; l < x; l++)
        {
            for (int n = 0; n < y; n++)
            {
                if (map[l][n] == ans1)
                {
                    System.out.printf("%d %d\n",l+1,n+1);
                }
            }
        }
        sc.close();
    }
}
