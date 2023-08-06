import java.io.*;

public class PgoodQ {

    public static String[] addstr(String[] array,String value){

        String[] newArray = new String[array.length + 1];
        for (int i = 0; i< array.length; i++){
            newArray[i] = array[i];
        }
        newArray[newArray.length-1] = value;
        return newArray;

    }
    public static int[] addint(int[] array,int value){

        int[] newArray = new int[array.length + 1];
        for (int i = 0; i< array.length; i++){
            newArray[i] = array[i];
        }
        newArray[newArray.length-1] = value;
        return newArray;

    }

    public static void main(String[] args) {
        String[] name = {};
        int[] day = {};
        String[] type = {};
        int[] money = {};
        try {
            FileReader fr  = new FileReader("em.txt");
            BufferedReader br = new BufferedReader(fr);
            String str;

            while ((str = br.readLine()) != null){
                // System.out.println(str + "\n");
                String[] strline = str.split(",");
                // System.out.println(strline[0]+strline[1]+strline[2]+strline[3]);
                name = addstr(name,strline[0]);
                day = addint(day,Integer.parseInt(strline[1]));
                type = addstr(type,strline[2]);
                money = addint(money,Integer.parseInt(strline[3]));

            }
            System.out.println(day[0] + " " + day[1] + " " +day[2]);
            br.close();
        }
        catch (IOException e) {
            System.out.println("error");
        }
        try {
            FileWriter fw = new FileWriter("companaja.txt");
            PrintWriter pw = new PrintWriter(fw);
            for (int i = 0; i<name.length;i++){
                // System.out.println(i);
                pw.print(name[i] + " ");
                pw.print(day[i] + " ");
                pw.print(type[i] + " ");
                pw.print(money[i] + " ");
                pw.println(" ");
                
            }
            pw.close();
        }
        catch (IOException e) {
            System.out.println("error");
        }

    }
    
}
