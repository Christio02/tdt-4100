package oving1;

public class LineEditor {

    // states
    private String text;
    private int insertionIndex;



    public LineEditor(String text, int insertionIndex) {
        this.text = text;
        this.insertionIndex = insertionIndex;
    }


    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getInsertionIndex() {
        return this.insertionIndex;
    }

    public void setInsertionIndex(int insertionIndex) {
        this.insertionIndex = insertionIndex;
    }

    public void left() {
        this.insertionIndex -= 1;
    }

    public void right() {
        this.insertionIndex += 1;
    }

    

}
