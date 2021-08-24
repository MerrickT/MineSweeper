package MineSweeper;

import static org.junit.jupiter.api.Assertions.assertFalse;

import minesweeper.Cell;
import org.testng.annotations.Test;

import org.junit.jupiter.api.DisplayName;

class CellTest {

    @Test
    @DisplayName("This is our test to find out if the isBomb function works")
        private void setIsBomb() {
        Cell.getUncovered();
    }

            protected void BombTester() {
                Cell cell = new Cell();
                cell.setIsBomb();
                assertFalse(cell.getIsBomb(), "Get isBomb test failure");
    }
}