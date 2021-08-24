package minesweeper;

public class Cell {
// Generates the Values for the Cell Object


    static boolean isBomb = false;
    static int surroundingBombs = 0;
    static boolean uncovered = true;

    public boolean getIsBomb()
    {
        return isBomb;
    }
    public void setIsBomb()
    {
        isBomb = true;
    }

    public boolean getUncovered()
    {
        return uncovered;
    }

    public void setUncovered()
    {
        uncovered = true;
    }



    // Generates the Cell Object

    //public void main(String[] args)
    //{
      //  Cell cell = new Cell();
    //}
    public String toString()
    {
        if (isBomb && uncovered)
        {
            return ("X");
        } else if (!isBomb && uncovered) {
            return ("O");
        } else {
            return (".");
        }

    }

}
