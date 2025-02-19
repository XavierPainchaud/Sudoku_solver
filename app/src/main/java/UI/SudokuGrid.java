package UI;

public class SudokuGrid {
    private int[][] grid;

    // Constructeur qui initialise la grille
    public SudokuGrid() {
        grid = new int[9][9];
        // Les cases sont automatiquement initialisées à 0 en Java
    }

    // Méthode pour afficher la grille dans la console
    public void display() {
        for (int[] row : grid) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}