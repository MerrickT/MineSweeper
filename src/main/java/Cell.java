public class Cell {
// Generates the Values for the Cell Object


    static boolean isBomb = false;
    int surroundingBombs = 0;
    static boolean uncovered = false;

    public static boolean getIsBomb()
    {
        return isBomb;
    }
    public static void setIsBomb()
    {
        // Generating isBomb Set
    }

    public static boolean getUncovered()
    {
        return uncovered;
    }

    public static void setUncovered()
    {
        // Generating uncovered Set
    }

    public String toString()
    {
        if (Cell.getIsBomb() && Cell.getUncovered())
        {
            return ("X");
        }
        else
        {
            return ("O");
        }
    }

    // Generates the Cell Object

    public void main(String[] args)
    {
        Cell cell = new Cell();
    }

}
