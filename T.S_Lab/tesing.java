public class tesing {
    public static void main(String[] args) {
  
            for(int i = 0; i < 9; i++){
                for(int j = 0; j < 9; j++){
                    if(j<=(3-i))
                        System.out.print("A");
                    else if(j>=(5+i))
                        System.out.print("B");
                    else if(i==4)
                        System.out.print("*");
                    else if(j==4)
                        System.out.print("+");
                    else if(j<=(i-5))
                        System.out.print("C");
                    else if(j>= 8+(5-i))
                        System.out.print("D");
                    else
                        System.out.print("0");
                    }
                    System.out.println();
            }
         
    }
    
}
