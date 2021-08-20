public class Grid {
    private int length;
    private int width;
    private CellGenerator[][] mineGrid;

    public Grid (int length, int width){
        this.length = length;
        this.width = width;
        }
    private void initialiseGrid(){
        mineGrid = new CellGenerator [length] [width];

        for (int i = 0; i<length; i++)
        {
           for (int j = 0; j<width; j++)
           {
               mineGrid [i][j] = new CellGenerator(i,j);
           }
        }
    }
}
