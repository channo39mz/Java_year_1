package packA;

public class Flight {
    private String code;
    private City scor;
    private City destination;
    private DayOfWeek day;
    private Time departTime;

    public Flight(String code, City scor, City destiation, DayOfWeek day, Time time){
        this.code = code;
        this.scor = scor;
        this.destination = destiation;
        this.day = day;
        this.departTime = time;
    }
    public String toString() {
        return "Flight [ " + this.code + " , " + this.scor + " , " + this.destination + " , " + this.day + " , " + this.departTime + " ]";
    }
}
