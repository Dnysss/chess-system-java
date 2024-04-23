/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author dnys
 */
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        
        while (true) {
            try {
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
                System.out.println();
            }
            catch (ChessException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
            catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
        
    }
}
