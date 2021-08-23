package MineSweeper;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import org.junit.jupiter.api.DisplayName;

public class Cell {

    @Test
    @DisplayName("This is our test to find out if the setNumber function works")
    public void setIsBomb() {
        Cell cell = new Cell();
        cell.setIsBomb(false);
        assertEquals(false, cell.getIsBomb(), "Get isBomb test failure");
    }
}