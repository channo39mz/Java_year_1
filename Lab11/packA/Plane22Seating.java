package packA;

public class Plane22Seating  extends PlaneSeating{
    private Flight flight;
    
    public Plane22Seating(String args){
        super();
        String[] tokens = args.split(",");
        int numRow = tokens.length;
        int numCol = tokens[0].length();
        this.seating = new char[numRow][numCol];
        for (int i = 0; i < tokens.length; i++){
            seating[i] = tokens[i].toCharArray();
        }
    }
    public void showString(){
        for(int i = 0; i < seating.length; i++){
            for(int j = 0; j < seating[0].length; j++){
                System.out.print(seating[i][j] );
            }
            System.out.println();
        }
    }
    public boolean reserveSeat(int row, int cal){
        System.out.println(seating[row][cal]);
        if(seating[row][cal] == '^'){
            System.out.println(seating[row][cal]);
            this.seating[row][cal] = 'x';
            System.out.println( seating[row][cal]);
            System.out.println("seat " + row + "," + cal + " symbol is ^. Latest seat map is");
        }
        return true;
    }
    private boolean isFull(){
        return true;
    }
}
