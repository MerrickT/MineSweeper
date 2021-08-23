public class Cell {
// Generates the Values for the Cell Object

    static boolean isBomb = false;
    int surroundingBombs = 0;
    static boolean uncovered = false;

    public static boolean isBomb()
    {
        return isBomb;
    }
    public static boolean uncovered()
    {
        return uncovered;
    }

    public Cell() {
    }

    // Generates the Cell Object

    public void main(String[] args)
    {
        Cell cell = new Cell();
    }

}
