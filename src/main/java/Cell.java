public class Cell {
// Generates the Values for the Cell Object


    static boolean isBomb = false;
    int surroundingBombs = 0;
    static boolean uncovered = false;

    public static boolean getIsBomb()
    {
        return isBomb;
    }
    public static void setIsBomb(boolean isBomb)
    {
        Cell.isBomb = isBomb;
    }

    public static boolean getUncovered()
    {
        return uncovered;
    }

    public static void setUncovered(boolean uncovered)
    {
        Cell.uncovered = uncovered;
    }

    public Cell() {
    }

    // Generates the Cell Object

    public void main(String[] args)
    {
        Cell cell = new Cell();
    }

}
