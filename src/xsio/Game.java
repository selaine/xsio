/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xsio;

/**
 *
 * @author Asus
 */
public class Game { 

    private Integer board[][] = new Integer[3][3];

    public Game() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.board[i][j] = 0;
            }
        }
    }

    public Integer[][] getBoard() {
        return board;
    }

    public void setBoard(int x, int y, Integer player) {
        this.board[x-1][y-1] = player;
    }

    public void showBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(this.board[i][j] + " ");
            }
            System.out.println("");
        }
    }

    boolean endGame() {
        
        for (int i = 1; i < 3; i++) {
             
        }
    }

    int winner() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
