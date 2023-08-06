import java.util.ArrayList;
import java.lang.Math;

public class Lab4Q4_65197 {
    public static void main(String[] args) {
        ArrayList<Integer> perfectlist = new ArrayList<Integer>();
        // เขียนเผื่อให้หา perfect number ตัวที่ n
        // ไม่ใช้ duble pow ไม่ได้
        for(Double n = 2.0; perfectlist.size()<5; n++){
            Double num = (Math.pow(2, n)-1);
            // จากสมการ (2^n-1)((2^n)-1) ถ้า (2^n)-1 เป็นจำนวนเฉพาะจำนวนนั้นคือ perfect number
            // ถ้า num เป็น จน. เฉพาะ หมายความว่าเป็น perfect number
            if (prime(num) > 0){
                Double Bfor =  num*Math.pow(2, n-1);
                // เปลี่ยนกลับเป็น int
                int ans = Bfor.intValue();
                perfectlist.add(ans);
            }
        }
        for (int end=0; end<perfectlist.size();end++){
            // print(perfectlist) ตำแหน่งที่ 0,1,2
            System.out.println(perfectlist.get(end));
        }
        
    }
    public static Double prime(Double num){
        // เช็คว่าเป้น จน. เฉพาะป่าว
        if(num > 1){
            Boolean a = true;
            for(int i = 2; i<num; i++){
                if(num%i == 0){
                    return(0.0);
                }
            }
            if(a){
                return(1.0);
            }
        }
        return(1.0);
    }
}
