public class Lab4Q3_65197 {
    public static void main(String[] args) {
        // java Lab4Q3_65197.java 2 3 4 5 20 22 123
        int amountCharge = 0;
        int hrsPark = 0;
        // System.out.println(args.length);
        for (int i = 0; i < args.length; i++) {
            hrsPark = Integer.parseInt(args[i]);
            int hr24 = 0;
            if(hrsPark >= 24){
                hr24 += hrsPark/24;
                hrsPark = hrsPark%24;
                amountCharge += 24*hr24;
            }
            if (hrsPark >= 18){
                amountCharge += 24;
                
            }
            while (hrsPark > 4 && hrsPark < 18){
                amountCharge += 1;
                hrsPark-=1;
            }

            if(hrsPark == 4){
                amountCharge += 10;
            }
            if(hrsPark == 3){
                amountCharge += 7;
            }
            if(hrsPark == 2){
                amountCharge += 4;
            }
            if(hrsPark == 1){
                amountCharge += 4;
            }

            System.out.println(amountCharge);
            amountCharge = 0;
            
    }
}   
}
