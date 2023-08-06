package packA;
import java.util.*;

public class CSTravel{
    private Map<String, FlightsReservation> catalog = new HashMap<String, FlightsReservation>();
    private Flight cs6003 = new Flight("cs6003", City.BKK, City.ICN, DayOfWeek.Mon, Time.pm1);
    private Flight cs6004 = new Flight("cs6004", City.BKK, City.ICN, DayOfWeek.Tue, Time.pm2);
    private Flight cs6005 = new Flight("cs6005", City.BKK, City.NRT, DayOfWeek.Wed, Time.pm3);
    private Flight cs6006 = new Flight("cs6006", City.BKK, City.SIN, DayOfWeek.Thr, Time.pm4);
    private Flight cs6007 = new Flight("cs6007", City.ICN, City.BKK, DayOfWeek.Fri, Time.pm5);
    {
    catalog.put("cs6003", new FlightsReservation(cs6003));  
    catalog.put("cs6004", new FlightsReservation(cs6004));
    catalog.put("cs6005", new FlightsReservation(cs6005));
    catalog.put("cs6006", new FlightsReservation(cs6006));
    catalog.put("cs6007", new FlightsReservation(cs6007));
    }
    public Map<String, FlightsReservation> getcatalog(){
        return catalog;
    }
    public FlightsReservation getflight(String code){
        return catalog.get(code);
    }
    
}