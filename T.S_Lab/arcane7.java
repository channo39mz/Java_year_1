import java.util.*;
public class arcane7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        ArrayList<String> lis = new ArrayList<String>();
        String[] arr = word.split("");
        int Rr = 0; // )
        int Lr = 0; // (
        int Rp = 0; // ]
        int Lp = 0; // [
        int Ra = 0; // }
        int La = 0; // {
        int Rm = 0; // >
        int Lm = 0; // <
        int Kr = 0; // ()
        int Kp = 0; // []
        int Ka = 0; //  {}
        int Km = 0; //  <>

        
        for (String u : arr)
        {
            if (u.equals("("))
            {
                Lr++;
            }
            if (u.equals(")"))
            {
                Rr++;
            }
            if (u.equals("["))
            {
                Lp++;
            }
            if (u.equals("]"))
            {
                Rp++;
            }
            if (u.equals("{"))
            {
                La++;
            }
            if (u.equals("}"))
            {
                Ra++;
            }
            if (u.equals("<"))
            {
                Lm++;
            }
            if (u.equals(">"))
            {
                Rm++;
            }
            lis.add(u);
        }
        int fix = lis.size();
        for (int r = 0; r < fix; r++)
        {
            boolean tag = true;
            int jum = 0;
            for (int yy = 0; yy < lis.size(); yy++)
            {
                if(lis.get(yy).equals("(") && tag)
                {
                    tag = false;
                    jum = yy;
                }
                if(lis.get(yy).equals(")") && !tag)
                {
                    lis.remove(jum);
                    lis.remove(yy-1);
                    Kr++;
                    Lr--;
                    Rr--;
                    break;
                    
                }
            }
        }
        //System.out.printf("%d %d %d %d %d %d %d %d\n" , Lr,Rr,Lp,Rp,La,Ra,Lm,Rm);
        for (int t = 0; t < fix; t++)
        {
            boolean tag = true;
            int jum = 0;
            for (int pp = 0; pp < lis.size(); pp++)
            {
                if(lis.get(pp).equals("[") && tag)
                {
                    tag = false;
                    jum = pp;
                }
                if(lis.get(pp).equals("]") && !tag)
                {
                    lis.remove(jum);
                    lis.remove(pp-1);
                    Kp++;
                    Lp--;
                    Rp--;
                    // System.out.println(lis);
                    break;
                    
                }
            }
        }
        for (int o = 0; o < fix; o++)
        {
            boolean tag = true;
            int jum = 0;
            for (int aa = 0; aa < lis.size(); aa++)
            {
                if(lis.get(aa).equals("{") && tag)
                {
                    tag = false;
                    jum = aa;
                }
                if(lis.get(aa).equals("}") && !tag)
                {
                    lis.remove(jum);
                    lis.remove(aa-1);
                    Ka++;
                    La--;
                    Ra--;
                    // System.out.println(lis);
                    break;   
                }
            }
        }
        for (int w = 0; w < fix; w++)
        {
            boolean tag = true;
            int jum = 0;

            // System.out.println(lis.size());
            for (int mm = 0; mm < lis.size(); mm++)
            {
                if(lis.get(mm).equals("<") && tag)
                {
                    tag = false;
                    jum = mm;
                }
                if(lis.get(mm).equals(">") && !tag)
                {
                    lis.remove(jum);
                    lis.remove(mm-1);
                    Km++;
                    Lm--;
                    Rm--;
                    // System.out.println(lis);
                    tag = true;
                    break;
                }
            }
        }
        System.out.printf("%d\n%d\n%d\n%d\n",Kr,Kp,Ka,Km);
        System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n" , Lr,Rr,Lp,Rp,La,Ra,Lm,Rm);
        // System.out.println(Lr+Rr+Lp+Rp+La+Ra+Lm+Rm+Kr+Kp+Ka+Km);
        long see = Lr+Rr+Lp+Rp+La+Ra+Lm+Rm+Kr+Kp+Ka+Km;
        Random ran = new Random(see);
        int number = ran.nextInt(1000000);
        System.out.printf("%06d" , number);
        sc.close();
    }
    
}
