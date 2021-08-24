package minesweeper;

public class Grid {
    private final int length;
    private final int width;
    private final Cell[][] mineGrid;


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
}

