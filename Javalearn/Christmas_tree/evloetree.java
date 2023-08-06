package Christmas_tree;
import java.util.Scanner;

public class evloetree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int finalT = 0;// นับฐานอันสุดท้าย
        int x = 4;// อันนี้เผื่อเอามาแทนชั้นของต้นคริสมัส แต่ตายโจทย์คือ 4
        // ลูปของชั้นที่จะทำ
        for (int layer = 0; layer<num; layer++){
            // ลูปด้านในแต่ละชั้นที่ทำ
            for(int lop = 1;lop<=4;lop++){
                // รอบลูปในผมให้เป็น 1 เพื่อเอาไปลบในลูปล่างนะครับแล้ว <= ทำให้รัน 4 รอบเท่าเดิม
                // ช่องว่างในแต่ละชั้น = จำนวนที่ให้ -1 
                // แต่ต้องลดจากลูปใหญ่เพิ่มด้วยเพราะชั้นแรกของชั้นถัดไปก็ต้องลดลง 1 ด้วยเช่นกัน
                // โดยช่องว่างจะลดลงทีละ1เสมอ คือตรงนี้ (4-lop)
                for(int nul = 0;nul<(4-lop)+((num-(layer+1))); nul++ ){
                    System.out.print(" ");

                }
                finalT=0;
                // เราจะพิมดาว = รอบของลูป * 2 แล้ว -1 #ผมใช้รอบเริ่มต้นจาก1 ดังนั้นจึง -1 นะครับ
                // ต้อง + ลูปใหญ่ * 2 ด้วยเพราะ ทุกรอบที่เริ่มรอบใหม่ตัวแรกที่เป็นตัวต้องคริสมัสใหม่จะเพิ่มทีละ 2
                for(int star = 0; star<(lop*2-1)+(layer*2) ; star++){
                    System.out.print("*");
                    finalT+=1;
                }
                System.out.println();
            }
            
        }
        // ฐานจะต้องเป็นเลขขี้เสมอเพื่อให้ปีกทั้งสองด้านเท่ากันหากฐานเป็นเลขคู่ต้องบวกดาว 1 ดวง
        // ฐานจะเป็นช่องว่าง = ฐานอันสุดท้าย/2 แล้วลบด้วย แล้วลบด้วยเลขที่รับมา/2 เพราะจาก
        // ตรงกลางจะมีฐานเพิ่มมาจากเลขที่ให้ครึ่งเดียว
        if(num%2==0){
            for (int p=0;p<num;p++){
                for (int t = 0;t<(finalT/2)-(num/2);t++){
                    System.out.print(" ");
                }
                for (int e = 0;e<num+1;e++){
                    System.out.print("*");
                }
                System.out.println();
            }
            
        }
        
        else{
            for (int p=0;p<num;p++){
                for (int t = 0;t<(finalT/2)-(num/2);t++){
                    System.out.print(" ");
                }
                for (int e = 0;e<num;e++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        
        sc.close();
    }
    
}
