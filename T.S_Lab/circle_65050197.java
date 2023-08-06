public class circle_65050197 {
    public static void main(String[] args) {
        // Circle a = new Circle();
        // System.out.println(a);
    }
}
class Circle
{
    double radius;
    Circle()
    {
        this.radius = 1.0; 
    }
    Circle(double radius)
    {
        this.radius = radius;
    }
    double getRadius()
    {
        return radius;
    }
    void setRadius(double radius)
    {
        this.radius = radius;
    }
    double getArea()
    {
        return Math.PI * Math.pow(radius,2);
    }
    double getCircumference() {
        return radius * 2 * Math.PI;
    }
    public String toString() {
        return "Cirle[radius=" + radius + "]";
    } 
}
