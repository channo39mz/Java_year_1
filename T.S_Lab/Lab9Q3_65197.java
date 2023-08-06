import java.util.*;

public class Lab9Q3_65197 {

    static int  ran(){
        Random r = new Random();// สุ่มระเบิด 50%
        int num = r.nextInt(100);
        if (num > 50){
            return 0;
        } 
        else{
            return 9;
        }
    }
    public static void main(String[] args) {
        int[][] msMap = {
            {0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        int[][] msMap2 = msMap;
        for (int k = 0; k<msMap.length; k++){
            for (int p = 0; p<msMap[k].length; p++){
                msMap[k][p] = ran();
                // System.out.println(msMap[k][p]);
            }
        }
        
    for (int row = 0; row <msMap.length;row++){
        System.out.println(Arrays.toString(msMap[row]));
    }
    System.out.println("");
    for (int R = 0; R < msMap2.length ; R++){
        int nub = 0;
        for (var i : msMap2[R]){
            if (i == 9){//ถ้าเจอ 9
                // System.out.printf("%d nee %d \n",nub ,msMap[1].length-1);
                if ((nub != 0) && (nub != msMap2[1].length-1)){//แถวตรวงกลางไม่ใช่ บนสุด ล่างสุด แถวแรกสุด แถวท้ายสุด
                    if(R!=0){// ไม่ใช่แถวแรกและแถวสุดท้ายแนวตั้งแนวตั้ง และ ไม่ใช่แถวแรกแนวนอน
                        if (msMap2[R-1][nub+1] != 9){
                            msMap2[R-1][nub+1] += 1;
                        }
                        if (msMap2[R-1][nub-1] != 9){
                            msMap2[R-1][nub-1] += 1;
                        }
                        if (msMap2[R-1][nub] != 9){
                            msMap2[R-1][nub] += 1;
                        }
                        // เช็คด้านบน
                    }
                    if(R != msMap2.length-1){ // ไม่ใช่แถวแรกและแถวสุดท้ายแนวตั้งแนวตั้ง และ ไม่ใช่แถวสุดท้ายแนวนอน
                        // System.out.printf("%d nee %d \n",nub ,msMap.length-1);
                        // เช็คด้านล่าง
                        if (msMap2[R+1][nub+1] != 9){
                            msMap2[R+1][nub+1] += 1;
                        }
                        if (msMap2[R+1][nub-1] != 9){
                            msMap2[R+1][nub-1] += 1;
                        }
                        if (msMap2[R+1][nub] != 9){
                            msMap2[R+1][nub] += 1;
                        }
                         // เช็คด้านล่าง
                    }
                    if (msMap2[R][nub+1] != 9){ // ตัวหลังเลข 9
                        msMap2[R][nub+1] += 1;
                    }
                
                    if (msMap2[R][nub-1] != 9){// ตัวหน้าเลข 9
                        msMap2[R][nub-1] += 1;
                    }
                }
                else if(nub == 0){// ตัวแรก
                    if (msMap2[R][nub+1] != 9){// ตัวหลังเลข 9
                        msMap2[R][nub+1] += 1;
                    }
                  
                    if(R!=0){//แถวแรก ที่ไม่ใช่ตัวแรก
                        if (msMap2[R-1][nub+1] != 9){
                            msMap2[R-1][nub+1] += 1;
                        }
                        if (msMap2[R-1][nub] != 9){
                            msMap2[R-1][nub] += 1;
                        }
                         // เช็คด้านบน
                    }
                    if(R != msMap2.length-1){//แถวสุดท้าย 
                        if (msMap2[R+1][nub+1] != 9){
                            msMap2[R+1][nub+1] += 1;
                        }
                        if (msMap2[R+1][nub] != 9){
                            msMap2[R+1][nub] += 1;
                        }
                         // เช็คด้านล่าง
                    }
                }


                else if (nub == msMap2[1].length-1){//ตัวสุดท้าย
                    if (msMap2[R][nub-1] != 9){
                        msMap2[R][nub-1] += 1;
                    }
                    if(R!=0){//ไม่ใช่แถวแรก
                        if (msMap2[R-1][nub-1] != 9){
                            msMap2[R-1][nub-1] += 1;
                        }
                        if (msMap2[R-1][nub] != 9){
                            msMap2[R-1][nub] += 1;
                        }
                    }
                    if(R != msMap2.length-1){//ไม่ใช่แถวสุดท้าย
                        if (msMap2[R+1][nub-1] != 9){
                            msMap2[R+1][nub-1] += 1;
                        }
                        if (msMap2[R+1][nub] != 9){
                            msMap2[R+1][nub] += 1;
                        }
                    }
                }
                else if(R == 0){//แถวแรก
                    if(nub == 0){//ตัวแรก
                        if (msMap2[R][nub+1] != 9){
                            msMap2[R][nub+1] += 1;
                        }
                        if (msMap2[R+1][nub+1] != 9){
                            msMap2[R+1][nub+1] += 1;
                        }
                        if (msMap2[R+1][nub] != 9){
                            msMap2[R+1][nub] += 1;
                        } 
                    }
                    if (nub == msMap2[1].length-1){//แถวสุดท้าย
                        if (msMap2[R][nub-1] != 9){
                            msMap2[R][nub-1] += 1;
                        }
                        if (msMap2[R+1][nub-1] != 9){
                            msMap2[R+1][nub-1] += 1;
                        }
                        if (msMap2[R+1][nub] != 9){
                            msMap2[R+1][nub] += 1;
                        } 
                    }
                    if (nub != msMap2[1].length-1 && nub != 0){//ตัวตรงกลางแถวแรก
                        if (msMap2[R][nub-1] != 9){
                            msMap2[R][nub-1] += 1;
                        }
                        if (msMap2[R][nub+1] != 9){
                            msMap2[R][nub+1] += 1;
                        }
                        if (msMap2[R+1][nub-1] != 9){
                            msMap2[R+1][nub-1] += 1;
                        }
                        if (msMap2[R+1][nub+1] != 9){
                            msMap2[R+1][nub+1] += 1;
                        }
                        if (msMap2[R+1][nub] != 9){
                            msMap2[R+1][nub] += 1;
                        } 
                    }
                }
                else if(R == msMap2[1].length-1){//แถวสุดท้าย
                    if(nub == 0){//ตัวแรก
                        if (msMap2[R][nub-1] != 9){
                            msMap2[R][nub-1] += 1;
                        }
                        if (msMap2[R-1][nub-1] != 9){
                            msMap2[R-1][nub-1] += 1;
                        }
                        if (msMap2[R-1][nub] != 9){
                            msMap2[R-1][nub] += 1;
                        } 
                    }
                    if (nub == msMap2.length-1){//ตัวสุดท้าย
                        if (msMap2[R][nub-1] != 9){
                            msMap2[R][nub-1] += 1;
                        }
                        if (msMap2[R-1][nub-1] != 9){
                            msMap2[R-1][nub-1] += 1;
                        }
                        if (msMap2[R-1][nub] != 9){
                            msMap2[R-1][nub] += 1;
                        } 
                    }
                    if (nub != msMap2[1].length-1 && nub != 0){//ตัวตรงกลางแถวสุดท้าย
                        if (msMap2[R][nub-1] != 9){
                            msMap2[R][nub-1] += 1;
                        }
                        if (msMap2[R][nub+1] != 9){
                            msMap2[R][nub+1] += 1;
                        }
                        if (msMap2[R-1][nub-1] != 9){
                            msMap2[R-1][nub-1] += 1;
                        }
                        if (msMap2[R-1][nub+1] != 9){
                            msMap2[R-1][nub+1] += 1;
                        }
                        if (msMap2[R-1][nub] != 9){
                            msMap2[R-1][nub] += 1;
                        } 
                    }

                }

            }//อยู่ในเจอ 9
            
            nub++;
        }
    }
    for (int row = 0; row <msMap2.length;row++){
        System.out.println(Arrays.toString(msMap2[row]));
    }
 
    }
}
