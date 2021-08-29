package minesweeper;

public class Cell {
// Generates the Values for the Cell Object


    boolean isBomb = false;
    int surroundingBombs = 0;
    boolean uncovered = true;

    public boolean getIsBomb()
    {
        return isBomb;
    }
    public void setIsBomb(boolean value)
    {
        this.isBomb = value;
    }

    public boolean getUncovered()
    {
        return uncovered;
    }

    public void setUncovered()
    {
        uncovered = true;
    }

    public String toString()
    {
        if (isBomb && uncovered)
        {
            return (" X ");
        } else if (!isBomb && uncovered)
        {
            return (" " + Integer.toString(this.surroundingBombs) + " ");
        } else {
            return (" . ");
        }

    }

}
