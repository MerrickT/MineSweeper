package MineSweeper;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.testng.annotations.Test;

import org.junit.jupiter.api.DisplayName;

class Cell {

    @Test
    @DisplayName("This is our test to find out if the isBomb function works")
    private boolean getIsBomb() {
        return false;
    }

    private void setIsBomb() {
    }

            protected Cell() {
                Cell cell = new Cell();
                cell.setIsBomb();
                assertFalse(cell.getIsBomb(), "Get isBomb test failure");
    }
}