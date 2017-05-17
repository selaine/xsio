/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xsio;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class XsiO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game f = new Game();
        Scanner sc = new Scanner(System.in);
        int x, y;
        int player = 1;
        while (true) {
            f.showBoard();
            x = sc.nextInt();
            y = sc.nextInt();
            
            if (player % 2 == 0) {
                f.setBoard(x, y, 2);
                player++;
            } else {
                f.setBoard(x, y, 1);
                player++;
            }

            if (f.endGame() == true||player==10) {
                int winner = f.winner();
                if (winner == 1 || winner == 2) {
                    System.out.println(winner + " a castigat ");
                } else {
                    System.out.println("Remiza");
                }
                break;
            }

        }
        f.showBoard();

    }

}
