public class att {
    public static int a = 10;
    public static void main(String[] args) {
        Mal a2 = new Mal();
        System.out.println(a2.x);
    }
    static class Mal{
        int x;
        Mal()
        {
            this.x = 10;
        }
    }
}

