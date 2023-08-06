import java.util.*;
public class Quiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int column = sc.nextInt();
        int row = sc.nextInt();
        int[][] arr = new int[row][column];

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int S = sc.nextInt();
        sc.close();
        int[] wat = new int[column];
        for (int l = 0; l < row; l++)
        {
            for (int k = 0; k < row-1; k++)
            {
                if (arr[k][S] > arr[k+1][S])
                {
                    wat = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = wat;
                }
            }
        }
        for (int a = 0; a < row; a++)
        {
            for(int j=0;j<column;j++){
                System.out.print(arr[a][j]);
      
                
                if(j<column-1){
                  System.out.print(" ");
                  
                }
              }
              System.out.println();
        }
      
    }
    
}
