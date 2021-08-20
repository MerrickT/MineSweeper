public abstract class Grid {
    private int length;
    private int width;
    private Cell[][] mineGrid;


    public Grid (int length, int width){
        this.length = length;
        this.width = width;
        }
    private void initialiseGrid()
    {
        mineGrid = new Cell [length] [width];

        for (int x = 0; x<length; x++)
        {
           for (int y = 0; y<width; y++) {
               mineGrid[x][y] = new Cell();

           }
           //for (int mineCounter;;);
        }

    }

    public abstract String toString();
    {
        if (Cell.isBomb() && Cell.uncovered());
        {
            return "X";
        }
        if (!Cell.isBomb() && Cell.uncovered());
        {
            return "O";
        }
    }
}
