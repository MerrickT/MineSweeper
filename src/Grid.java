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
    }
}
