package oving5;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StringGridIterator implements Iterator<String> {

    private StringGrid grid;
    private boolean rowMajor;
    private int currentRow;
    private int currentCol;

    public StringGridIterator(StringGrid grid, boolean rowMajor) {
        this.grid = grid;
        this.rowMajor = rowMajor;
        this.currentCol = 0;
        this.currentRow = 0;

    }


    @Override
    public boolean hasNext() {
        if (rowMajor) {
            return currentRow < grid.getRowCount() && currentCol < grid.getColumnCount(); // checks if gridindex is within valid row and column count
        } else {
            return currentCol < grid.getColumnCount() && currentRow < grid.getRowCount();
        }
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements in the grid");
        }
        String nextElement = grid.getElement(currentRow, currentCol); // Move to the next column if we've reached the end of the row

        if (rowMajor) { // if iterating by rows
            currentCol++; // increment column (to keep up with iterater)
            if (currentCol >= grid.getColumnCount()) { // then when currentCol is larger than get columncount
                currentRow++; // current row will increment
                currentCol = 0; // current col will reset
            }
        } else {
            currentRow++;
            if (currentRow >= grid.getRowCount()) {
                currentCol++;
                currentRow = 0;
            }
        }
        return nextElement;
    }


    @Override
    public void remove() {
        throw new UnsupportedOperationException("You can't remove Strings from grid!");
    }
    
}
