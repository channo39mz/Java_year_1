import java.util.Scanner;

public class Main {
  public static float pow(int a,int b) {
  	float ans = 1;
    if (b>0){
      for(int i=0; i<b;i++){
        ans = ans*a;
      }
    }
    if (b==0){
      ans = 1;
    }
    if (b<0){
      for(int i=0; i>b;i--){
        ans /= a;
        // System.out.println(ans);
      }
      
    }
    return(ans);
  }

  public static void main(String[] args) {
  	Scanner scn = new Scanner(System.in);
    int x = scn.nextInt();
    int y = scn.nextInt();
    System.out.println(pow(x , y));
    scn.close();
  }
}

