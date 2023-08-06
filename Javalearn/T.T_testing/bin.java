import java.util.*;
import java.util.Scanner;

public class bin {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        String binoder = scan.nextLine();
        // System.out.println(binoder);
        String[] bin = binoder.split(" ");
        for (String i : bin){
            list.add(Integer.parseInt(i));
        }
        // System.out.println(list.get(0));


        // BGC 012 345 678
        List<Integer> cal = new ArrayList<Integer>();
        //BGC 048
        int value = list.get(3)+  list.get(6) + list.get(1)+list.get(7)+list.get(2)+list.get(5);
        cal.add(value);
        // BCG 057
        int value2 = list.get(3)+  list.get(6) + list.get(2)+list.get(8)+list.get(4)+list.get(1);
        cal.add(value2);
        // GCB 156
        int value3 = list.get(4)+  list.get(7) + list.get(2)+list.get(8)+list.get(0)+list.get(3);
        cal.add(value3);
        // GBC 138
        int value4 = list.get(4)+  list.get(7) + list.get(0)+list.get(6)+list.get(2)+list.get(5);
        cal.add(value4);
        // CGB 246
        int value5 = list.get(5)+  list.get(8) + list.get(1)+list.get(7)+list.get(3)+list.get(0);
        cal.add(value5);
        // CBG 237
        int value6 = list.get(5)+  list.get(8) + list.get(0)+list.get(6)+list.get(4)+list.get(1);
        cal.add(value6);

        int min = cal.get(0);

        for (int i : cal){
            if (i<min){
                min = i;
            }
        }
        for (int i = 0; i<6;i++){
            if (cal.get(i) == min){
                switch (i) {
                    case 0:
                        System.out.print("BGC");
                        System.out.print(min);
                        break;
                    case 1:
                        System.out.print("BCG");
                        System.out.print(min);
                        break;
                    case 2:
                        System.out.print("GCB");
                        System.out.print(min);
                        break;
                    case 3:
                        System.out.print("GBC");
                        System.out.print(min);
                        break;
                    case 4:
                        System.out.print("CGB");
                        System.out.print(min);
                        break;
                    case 5:
                        System.out.print("CBG");
                        System.out.print(min);
                        break;
                
                    default:
                        break;
                }
                break;
            }
        }





        scan.close();
        
    }
}
