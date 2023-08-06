import java.util.*;
public class arcane5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> listroom = new ArrayList<Integer>();
        int room = sc.nextInt();
        for (int i = 0; i < room; i++){
            listroom.add(sc.nextInt());
        }
        int bastyear = sc.nextInt();
        for (int i = 0; i < listroom.size(); i++)
        {
            listroom.set(i , listroom.get(i) + bastyear);
        }
        //System.out.println(listroom);
        List<Integer> listwhat = new ArrayList<Integer>();
        int what = sc.nextInt();
        for (int j = 0; j < what; j++){
            listwhat.add(sc.nextInt());
        }
        for (int q : listwhat)
        {
            int nub = 1;
            boolean tag = true;
            for (int k : listroom)
            {
                if (q >= k)
                {
                    System.out.print(nub);
                    if (nub != listroom.size())
                    {
                        System.out.print(" ");
                    }
                    tag = false;
                }
                nub++;
            }
            if (tag){
                System.out.print("full");
            }
            
            System.out.println();
            
        }
        sc.close();
    }
}
