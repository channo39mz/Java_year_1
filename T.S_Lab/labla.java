public class labla {
    public static void main(String[] args) {
        int [] arr = { 1, 2, 1, 4, 2, 5, 2, 7 };
        /*20*/ int maxCnt = 0;
        /*30*/ int arrSize = arr.length; // arrSize is 8
        int cnt = 0;
        int m = 0;
        int k = 0;
        int ans = 0;
        int secret = 0;
        /*40*/ for (int i = 0; i < arrSize; i++) {
        /*50*/      cnt = 0;
        /*60*/      for (int j = 0; j < arrSize; j++) {
        /*70*/          if (arr[i] == arr[j]) {
        /*80*/              cnt++;
        /*90*/              k++; /* A */
        /*100*/         } // if
        /*110*/     } // j
        /*120*/     if (cnt > maxCnt) {
        /*130*/             maxCnt = cnt;
        /*140*/             ans = arr[i];
        /*150*/             secret = i; /* B */
        /*160*/             m++; /* C */
        /*170*/ } // if 
        
        /*180*/ }
        System.out.printf("%d",secret);
        System.out.println();
        /*190*/ System.out.println(ans + " " + maxCnt);
        /*200*/ secret += k + m;
        System.out.printf("%d %d",k,m);
        System.out.println();
        /*210*/ System.out.println(secret);
    }
    
}
