import java.util.*;
public class arcane6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        boolean di = true;
        int num = sc.nextInt();
        for (int i = 0; i < num; i++)
        {
            int thisnum = sc.nextInt();
            for (int j = 0; j < thisnum; j++)
            {
                list.add(sc.nextInt());
            }
            list.sort(null);
            Collections.reverse(list);
            System.out.println(list);
            for (int k = 0; k < thisnum-1; k++)
            {
                if (Math.abs(list.get(0) - list.get(1)) <= 1 )
                {
                    if (list.get(0) > list.get(1)){
                        list.remove(list.get(0));
                    }
                    else{
                        list.remove(list.get(1));
                    }
                    // System.out.println(list);
                    continue;
                }
                di = false;
                break;
            }
            if (di){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            list.clear();
            di = true;
        }
        sc.close();
    }
}
