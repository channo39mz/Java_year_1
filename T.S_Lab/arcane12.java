import java.util.*;
public class arcane12 {
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
  
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }
    static boolean isforbit(int[] n,int[] j)
    {
        
  
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        String ro = sc.nextLine();
        for (int i = 0; i < Integer.parseInt(ro); i++){
            String thisro = sc.nextLine();
            String nouse = sc.nextLine();
            ArrayList<Integer> lis = new ArrayList<Integer>();
            ArrayList<Integer> tab = new ArrayList<Integer>();
            int ans = 0;
            for (int j = 0; j < Integer.parseInt(thisro); j++){
                lis.add(j+1);
                if(nouse.charAt(j) == '1'){
                    tab.add(j+1);
                }
                if(nouse.charAt(j) == '0'){
                    tab.add(0);
                }
            }
            for (int x = 0; x < tab.size();x++) // down
            {
                if(tab.get(x) != 0){
                    continue;
                }
                for (int y = 0; y < tab.size();y++) // up
                {
                    // if (tab.get(y) == 0){
                        if(lis.get(y) % (x+1) == 0 && tab.get(y) != lis.get(y) && lis.get(y) != 0){
                            ans += x+1;
                            // System.out.print(x+1);
                            lis.set(lis.get(y)-1,0);
                        }
                        else if (lis.get(y) % (x+1) == 0 && tab.get(y) == lis.get(y) && lis.get(y) != 0){
                            break;
                        }
                    // }
                }
            }
            // System.out.println(lis);
            // System.out.println(tab);
            System.out.println(ans);
        }
        sc.close();
    }
}
