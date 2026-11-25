package board;

import figure.*;


public class Board {
    Square[][] board=new Square[9][9];

    public Board() {
        for(int y=1;y<9;y++){   //initialization empty square
            for(int x=1;x<9;x++) {
                board[y][x]=new Square((y+x)%2==1?false:true);
            }
        }
        for(int x=1;x<9;x++){  //initialization white pawns
            board[2][x].setFigure(new Pawn(false));
        }
        for(int x=1;x<9;x++){  //initialization white pawns
            board[7][x].setFigure(new Pawn(true));
        }
        board[1][1].setFigure(new Rook(false));
        board[1][8].setFigure(new Rook(false));
        board[8][1].setFigure(new Rook(true));
        board[8][8].setFigure(new Rook(true));
        board[1][2].setFigure(new Knight(false));
        board[1][7].setFigure(new Knight(false));
        board[8][7].setFigure(new Knight(true));
        board[8][2].setFigure(new Knight(true));
        board[1][3].setFigure(new Bishop(false));
        board[1][6].setFigure(new Bishop(false));
        board[8][3].setFigure(new Bishop(true));
        board[8][6].setFigure(new Bishop(true));
        board[8][5].setFigure(new King(true));
        board[1][5].setFigure(new King(false));
        board[1][4].setFigure(new Queen(false));
        board[8][4].setFigure(new Queen(true));
    }

    public String toString(){
        StringBuilder display= new StringBuilder();
        display.append("  ");

            for (int i = 0; i < 8; i++) display.append((char)('A'+i)).append(" ");

            for (int y = 1; y < 9; y++) {
                display.append("\n");

                display.append(y);
                for (int x=1; x < 9; x++) {
                    display.append(" ").append(board[y][x]);
                }

            }


        return display.toString();

    }
}
