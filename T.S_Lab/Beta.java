import java.util.*;
public class Beta { 
    String [] arr; 
    ArrayList<String> ans; 
    Beta() { 
        String [] obj = {"c","b","a"}; 
        arr = obj; 
        ans = new ArrayList<String>(); 
    } 
    public static void main(String [] args) { 
        Beta b = new Beta();
        b.recurse(0,""); 
        System.out.println(b.ans);
        for (String str: b.ans) { 
            System.out.print("\"" +str + "\", "); 
        } 
        System.out.println("bye"); 
    } 
    void recurse(int pos, String tmp) { 
        if (pos == arr.length) { 
            ans.add(tmp); 
            System.out.println(ans);
            return; 
        } 
        System.out.println(pos);
        recurse(pos + 1, tmp); 
        tmp = tmp.concat(arr[pos]); 
        recurse(pos + 1, tmp); 
    } 
   
}