package MineSweeper;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.testng.annotations.Test;

import org.junit.jupiter.api.DisplayName;

class Cell {

    @Test
    @DisplayName("This is our test to find out if the setNumber function works")
    private boolean getIsBomb() {
        return false;
    }

    private boolean setIsBomb() {
        return false;
    }

            public Cell() {
                Cell cell = new Cell();
                cell.setIsBomb();
                assertEquals(false, cell.getIsBomb(), "Get isBomb test failure");
    }
}