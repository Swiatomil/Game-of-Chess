package figure;

abstract public class Figure {
    private final boolean color; //0 white,1 black
    private final char symbol;
    void move(){}

    Figure(boolean color, char symbol){
        this.color=color;
        this.symbol=symbol;
    }

    public boolean isColor() {
        return color;
    }

    public char getSymbol() {
        return symbol;
    }
}
