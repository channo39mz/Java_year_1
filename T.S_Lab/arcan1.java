import java.util.*;
public class arcan1 {
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
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String word = sc.nextLine();
        String[] sp = word.split(" ");
        int max = 0;
        for (String w : sp)
        {
            int newW = 0;
            newW = w.length();
            if (newW > max)
            {
                max = newW;
                //System.out.println(max);
            }
        }
        sc.close();
        // System.out.println(sp.length);
        for (int i = 0; i < sp.length+2; i++)
        {
            if (i == 0 || i == sp.length+1)
            {
                for (int j = 0; j < max+4; j++)
                {
                    System.out.print(a);
                }
            }
            else{
                System.out.printf("%s %s" ,a ,sp[i-1]);
                for (int u = sp[i-1].length(); u < max+1; u++)
                {
                    System.out.print(" ");
                }
                System.out.print(a);
            }
            System.out.println();
            
        }
        if (isPrime(sp.length)){
            System.out.printf("%sJosephine Father ev3ry 1nstitude%s",'"','"');
        }
        else if (sp.length % 2 == 0){
            System.out.printf("%sDame da ne. Dame yo, dame na no yo%s",'"','"');
        }
        else
        {
            System.out.printf("%sNever Gonna Give You Up%s",'"','"');
        }

    }
    
}
