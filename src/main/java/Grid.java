public abstract class Grid {
    private int length;
    private int width;
    private Cell[][] mineGrid;


    protected Grid(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void initialiseGrid() {
        mineGrid = new Cell[length][width];

        for (int x = 0; x < length; x++) {
            for (int y = 0; y < width; y++) {
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

