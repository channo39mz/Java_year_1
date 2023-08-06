public class Lab7Q3_65197 {
    public static void main(String[] args) {
        // numDaysFromDate(15, 8, 2003, 5); // อันนนี้วันเกิด
        // // numDaysFromDate(16, 9, 2003, 2);
         numDaysFromDate(29, 2, 2004, 5);
    }
    static void numDaysFromDate(int date, int month, int year, int myBD) {
        int daysBornTil31Dec2021 = 0;
        int [] daymonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 , 31};
        int setMday = daymonth[month-1]; // เซ็ตวันที่ของเดือนที่เราสนใจ -1 เพราะว่าตำแหน่งมันเริ่มที่ 0
        daysBornTil31Dec2021 += setMday - date; // บวกวันที่เหลือของเดือนนั้น
        // System.out.println(daysBornTil31Dec2021);
        // บวกเดือนที่เหลือ ไม่-1 เพราะเราไม่คิดเดือนที่เรานับไปแล้ว
        for(int i = month; i < daymonth.length ; i++){
            daysBornTil31Dec2021 += daymonth[i];
        }
        // เช็คอธิกสุรทินในปีนั้นเท่านั้น แต่ถ้ามันเกินเดือน 2 ไปแล้วไม่มีผล
        if ( ((year%400 == 0) || ((year%4 == 0) && (year%100 != 0))) && (month <=2) ){
            daysBornTil31Dec2021 += 1;
        }
        // System.out.println(daysBornTil31Dec2021);
        year+=1;// ไม่นับปีที่นับไปแล้ว
        daysBornTil31Dec2021 += ((2022 - (year))*365); // 2022 เพราะวันที่ 31ธันวา2021 +2มันเท่ากับปี 2022แล้ว
        // System.out.println(daysBornTil31Dec2021);
        for (int y = year; y<2022;y++){
            if ((y%400 == 0) || ((y%4 == 0) && (y%100 != 0))){
                daysBornTil31Dec2021 += 1;// เช็คอธิกสุรทิน 
            }
        }
        int daysBornTil2Jan2022 = daysBornTil31Dec2021 + 2; 
        String str = showResult(date, month, year, myBD, daysBornTil2Jan2022);
        System.out.println(str); // มันจะเกินมา 2 วัน เพราะ บวกไป 2 วัน 
        
    } 
    static String showResult(int date, int month, int year, int myBD, int fromNumDaysFromDate) {
        String[] dayName = { "Sunday", "Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday" };
        int dayFromSun = 0;
        int modResult = fromNumDaysFromDate % 7;
        // เรียงให้เป็น 0-6 นับจาก อาทิตย์ -> เสาร์ อยากลอง switch

        //ย้อนกลับเพราะเราจะนับถอยหลังง !!
        switch(modResult){
            case 0:dayFromSun = 0;
            case 6: 
                dayFromSun = 1;
                break;
            case 5:
                dayFromSun = 2;
                break;
            case 4:
                dayFromSun = 3;
                break;
            case 3:
                dayFromSun = 4;
                break;
            case 2:
                dayFromSun = 5;
                break;
            case 1:
                dayFromSun = 6;
                break;
        }
        String str = String.format("You were born on %s and have been born for %d days (2 Jan 2022).Your program says %s", dayName[myBD], fromNumDaysFromDate, dayName[dayFromSun]);
        return str;
    }
}
