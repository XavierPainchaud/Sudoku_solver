package org.example;

import javax.swing.*;

import UI.SudokuGrid;

public class SudokuSolver {
    public static void main(String[] args) {

        SudokuGrid grid = new SudokuGrid();
        grid.display();
        
        // Lance l'interface graphique dans le thread dédié à l'UI
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Sudoku Solver");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.setLocationRelativeTo(null); // Centre la fenêtre à l'écran

            // Création d'un panneau simple avec un message de bienvenue
            JPanel panel = new JPanel();
            JLabel label = new JLabel("Bienvenue dans le Sudoku Solver !");
            panel.add(label);
            frame.add(panel);

            frame.setVisible(true);
        });
    }
}
