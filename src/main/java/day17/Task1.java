package day17;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        ChessPiece[] chessPieces = new ChessPiece[]{ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
                ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK,
                ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK};
        Arrays.stream(chessPieces).forEach(el -> System.out.print(el.getDesignation() + " "));

    }
}