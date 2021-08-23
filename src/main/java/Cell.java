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
    }

    public static boolean getUncovered()
    {
        return uncovered;
    }

    public static void setUncovered()
    {
    }

    /*public Cell() {
    }*/

    // Generates the Cell Object

    public void main(String[] args)
    {
        Cell cell = new Cell();
    }

}
