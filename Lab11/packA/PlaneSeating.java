package packA;

abstract class PlaneSeating {
    protected char[][] seating;

    public abstract void showString();
    public abstract boolean reserveSeat(int row , int col);

}
