package oving5;

public class StringGridImpl implements StringGrid{

    private int rows;
    private int columnCount;

    public StringGridImpl(int rows, int columnCount) {
        this.rows = rows;
        this.columnCount = columnCount;
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
        
        return null;
    }

    @Override
    public void setElement(int row, int column, String element) {
        // TODO Auto-generated method stub
        
    }
    
}
