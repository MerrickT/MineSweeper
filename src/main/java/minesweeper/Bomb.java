package minesweeper;

import java.util.Random;

public class Bomb {
    public static Grid placeBombs(Grid bombPlacingGrid)
    {
        for (int i = 0; i < 16; i++)
        {
            int column = (int) (Math.random() * 15) + 1;
            int row = (int) (Math.random() * 15) + 1;
            bombPlacingGrid.getCell(column, row).setIsBomb();
            //bombPlacingGrid.setCell(column, row, bombPlacingGrid.getCell(column, row).);
        }
        return bombPlacingGrid;
    }
}
