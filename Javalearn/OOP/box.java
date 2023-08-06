package OOP;

public class box {
    public double a,d,c;

    public double volum(){
        return a+d+c;
    }

    public double surface(){
        return (2*a+d) + (2*d+c) + (2*a+c);
    }

}
