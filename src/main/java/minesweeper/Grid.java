package minesweeper;

public class Grid {
    private int length;
    private int width;
    private Cell[][] mineGrid;

    public Grid(int length, int width)
    {
        this.length = length;
        this.width = width;

        mineGrid = new Cell[length][width];

        initialiseGrid();
    }

    public Cell getCell(int length, int width)
    {
        return this.mineGrid[length] [width];
    }

    public void setCell(int length, int width, Cell tile)
    {
        this.mineGrid [length] [width] = tile;
    }

    private void initialiseGrid()
    {

        for (int x = 0; x < length; x++)
        {
            for (int y = 0; y < width; y++)
            {
                mineGrid[x][y] = new Cell();
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int x = 0; x < length; x++)
        {
            for (int y = 0; y < width; y++)
            {
                sb.append(mineGrid[x][y]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public void placeBombs()
    {
        for (int i = 0; i < 16; i++)
        {
            int column = (int) (Math.random() * 9) + 1;
            System.out.println("column" + column);
            int row = (int) (Math.random() * 9) + 1;
            System.out.println("row" + row);

            //bombPlacingGrid.setCell(column, row, bombPlacingGrid.getCell(column, row).);
        }
    }
}

