package board;

import figure.Figure;

public class Square {
    boolean color; //0 white,1 black
    Figure figure;

    public Square(boolean color, Figure figure) {
        this.color = color;
        this.figure = figure;
    }

    public Square(boolean color) {
        this.color = color;

    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    @Override
    public String toString() {
        if (figure==null)
            return " ";
        else
            return String.valueOf(figure.getSymbol());
    }
}
