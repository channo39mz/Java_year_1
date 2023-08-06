package OOP;

import java.text.Format;

public class box_get_set {
    private double a,d,c;

    // constructer
    public box_get_set(double a, double d , double c){
        // this.a = a;
        // this.d = d;
        // this.c = c;
        setA(a);
        setD(d);
        setC(c);

    }
    // default constructer
    public box_get_set(){

    }

    public double getA(){
        return a;
    }
    public double getD(){
        return d;
    }
    public double getC(){
        return c;
    }

    public void setA(double a){
        if (a>0){
            this.a = a;
        }
        else{
            throw new IllegalArgumentException("a must > 0");
        }
    }
    public void setD(double d){
        this.d = d;
        if (d>0){
            this.d = d;
        }
        else{
            throw new IllegalArgumentException("d must > 0");
        }
    }
    public void setC(double c){
        this.c = c;
        if (c>0){
            this.c = c;
        }
        else{
            throw new IllegalArgumentException("c must > 0");
        }
    }



    public double volum(){
        return a+d+c;
    }

    public double surface(){
        return (2*a+d) + (2*d+c) + (2*a+c);
    }

    @Override
    public String toString(){
        return String.format("a = %.2f , d = %.1f , c = %.0f" , a, d, c);
    }
    
}
