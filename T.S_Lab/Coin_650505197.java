public class Coin_650505197 {
    public static void main(String[] args) {
        
        Coin a = new Coin();
        a.setColor("pp");
        System.out.println(a.getCoin());
        a.flip();
        System.out.println(a.getCoin());
        a.setColor("blue");
        System.out.println(a.getCoin());
        a.flip();
        System.out.println(a.getCoin());
        a.flip();
        System.out.println(a.getCoin());

    }
}
class Coin{
    String colorHead = "red";
    String colorTail = "red";

    Coin()
    {
        setColor(colorHead);
    }
    Coin(String color)
    {
        setColor(color);
    }
    String getCoin()
    {
        return colorHead; 
    }
    void setColor(String color)
    {
        this.colorHead = color;
    }
    void flip()
    {
        String wat = this.colorHead;
        this.colorHead = this.colorTail;
        this.colorTail = wat;
    }
}
