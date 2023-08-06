package packA;

public class FlightsReservation {
    private Flight flight;
    private PlaneSeating seating;

    public void showString(){
        System.out.println(flight);
        seating.showString();
    }
    public boolean reserveSeat(int row , int col){
        if(col > (seating.seating.length /2)){
            seating.reserveSeat(row -1 , col );
        }
        else{
            seating.reserveSeat(row -1 , col -1);
        }
      
        seating.showString();
        return true;
    }
    public FlightsReservation(Flight f){
        seating = new Plane22Seating("xx_xx,xx_x^,^x_xx,x^_xx,xx_^x");
        this.flight = f;
    }
}
