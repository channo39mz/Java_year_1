import java.util.*;

public class arcan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int norm = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        int num = sc.nextInt();
        for (int i = 0; i < num; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                norm = sc.nextInt();
                if (j  == 0 && norm == 1)
                {
                    a += 1500;
                }
                if (j  == 1 && norm == 0)
                {
                    b += 80;
                }
                if (j  == 1 && norm == 1)
                {
                    b += 130;
                }
                if (j  == 2 && norm == 1)
                {
                    c += 800;
                }
                if (j  == 3 && norm == 1)
                {
                    d += 2000;
                }
            }
        }
        sc.close();
        System.out.printf("%d %d %d %d %d" , a, b, c, d, a+b+c+d);
    }
}
