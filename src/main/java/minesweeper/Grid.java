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
        this.placeBombs();
        this.countThroughGrid();
    }

    public Cell getCell(int length, int width)
    {
        return this.mineGrid[length] [width];
    }

    public void setCell(int length, int width)
    {
        this.mineGrid [length] [width].setIsBomb(true);
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
            int row = (int) (Math.random() * 9) + 1;
            int column = (int) (Math.random() * 9) + 1;
            setCell(column,row);
        }
    }
    public void bombProximityCounter(int x,int y)
        {
            int[][] surroundings = {{1,1},{1,0},{1,-1},{0,-1},{-1,-1},{-1,0},{-1,1},{0,1}};
            int bombCounter = 0;
            for(int i = 0; i < surroundings.length; i++)
            {
                int[] testingCell = {x+surroundings[i][0],y+surroundings[i][1]};
                if(testingCell[0]<0 || testingCell[1]<0 || testingCell[0]>=this.length || testingCell[1]>=this.width)
                {
                    continue;
                }
                if(getCell(testingCell[0],testingCell[1]).getIsBomb())
                {
                    bombCounter++;
                }
            }
            getCell(x,y).surroundingBombs = bombCounter;
        }

    public void countThroughGrid()
    {
        for (int x = 0; x < length; x++)
        {
            for (int y = 0; y < width; y++)
            {
                bombProximityCounter(x,y);
            }
        }
    }

}

