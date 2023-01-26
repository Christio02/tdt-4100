package oving1;

public class LineEditor {

    // states
    private String text;
    private int insertionIndex;

    public LineEditor() {
        text = new String();

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

    public void insertString(String s) {
        String begin = getText().substring(0, getInsertionIndex()); // substring that sets where in text the new string
                                                                    // would be
        String end = getText().substring(insertionIndex); // sets the start to insertionIndex
        this.text = begin + s + end;
        // need to set textposition to new string, need to move right of new text
        // setInsertionIndex(s.length() + 1);

    }

    public void deleteLeft() {
        for (int i = 0; i < text.length(); i++) {
            if (i == insertionIndex) {
                String newS = text.substring(0, i) + text.substring(i + 1);
                this.text = newS;
            }
        }
    }

    @Override
    public String toString() {
        String begin = getText().substring(0, getInsertionIndex()); // substring that sets where in text the new string
                                                                    // would be
        String end = getText().substring(insertionIndex); // sets the start to insertionIndex
        return begin + "|" + end;
    }

    public static void main(String[] args) {
        LineEditor l = new LineEditor();
        l.setText("Javagøy!");
        l.setInsertionIndex(4);
        l.insertString("er");
        System.out.println(l.getInsertionIndex());
        System.out.println(l);

    }

}
