import java.util.*;

public class arcan3 {
    public static void main(String[] args) {
        
        String ans = "";
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        for (int i = 0; i < word.length(); i++)
        {
            char Ascii = word.charAt(i);
            int ascii = Ascii;
            ascii -= 26;
            if (ascii > 32 && ascii < 126)
            {
                ans += (char) ascii;
            }
        }
        sc.close();
        System.out.println(ans);
    }
}
