package oving5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringGridImpl implements StringGrid{

    private int rows;
    private int columnCount;
    private List<List<String>> grid;
    

    public StringGridImpl(int rows, int columnCount) {
        this.rows = rows;
        this.columnCount = columnCount;
        grid = new ArrayList<>(); // creates new grid
        for (int i = 0; i < rows; i++) { // goes through rows and creates columns
            List<String> row = new ArrayList<>();
            
            for (int j = 0; j < columnCount; j++) { // goes through columns and adds empty strings at grids
                row.add("");
            }
            grid.add(row); // adds rows
        }
        
    }



    @Override
    public int getRowCount() {
        
        return this.rows;
    }

    @Override
    public int getColumnCount() {
        return this.columnCount;
    }

    @Override
    public String getElement(int row, int column) {
        if (row < 0 || row >= rows || column < 0 || column >= columnCount) {
            throw new IllegalArgumentException("Row or colunn out of range!");
        }
        return grid.get(row).get(column);
    }

    @Override
    public void setElement(int row, int column, String element) {
        if (row < 0 || row >= rows || column < 0 || column >= columnCount) {
            throw new IllegalArgumentException("Row or colunn out of range!");
        }
        this.grid.get(row).set(column, element);
        
    }
    
    @Override
    // this code essentially visualizes the grid
    public String toString() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columnCount; j++) {
            sb.append(grid.get(i).get(j));
            if (j < columnCount - 1) {
                sb.append(" | ");
            }
        }   
        sb.append("\n");
        if (i < rows - 1) {
            sb.append("-".repeat(columnCount * 3 - 1));
            sb.append("\n");
        }
    }
    return sb.toString();
}

    @Override
    public Iterator<String> iterator() {
        return new StringGridIterator(this, true);
    }

    public static void main(String[] args) {
        StringGridImpl grid1 = new StringGridImpl(10, 10);
        
        grid1.setElement(2, 2, "Figma");
        System.out.println(grid1.getElement(2, 2));

        System.out.println(grid1);


    }



    
}