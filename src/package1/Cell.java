package package1;

import java.util.ArrayList;
import java.util.List;

public class Cell {

    public boolean isFlagged = false;
    public int value;

    public Cell(boolean isFlagged, int value) {
        this.isFlagged = isFlagged;
        this.value = value;
    }

    public void verifyFlagged(boolean isFlagged) {
        if (value == 2) {
            isFlagged = true;
        }
    }

    /*
     * public List<int[]> getThem() {
     * List<int[]> list1 = new ArrayList<>();
     * for (int[] x : theList) {
     * if (x[0] == 4) {
     * list1.add(x);
     * }
     * }
     * 
     * return list1;
     * }
     */

    // consegues perceber a diferença deste codigo acima para o codigo abaixo?
    // este é o poder de dar significado aos nomes, tanto de variaveis, como de
    // classes e etc
    // por isso, quando for declarar algo, pense bem antes de fazelo

    /**
     * public List getFllagedCell() {
     * List<Cell> flaggedCells = new ArrayList<Cell>();
     * for (Cell cell : gameBoard) {
     * if (cell.isFlagged()) {
     * flaggedCells.add(cell);
     * }
     * }
     * return flaggedCells;
     * }
     */
}
