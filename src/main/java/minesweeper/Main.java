package minesweeper;

public class Main
{
    public static void main (String[] args)
    {
        Grid newGame = new Grid(10,10);
        boolean gameOver = false;

        while(!gameOver)
        {
            System.out.println(newGame);

            gameOver = true;
        }
    }
}
