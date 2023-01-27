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
        this.insertionIndex = Math.max(0, insertionIndex - 1); // sets insertionindex altways to 0, can't be lower

    }

    public void right() {
        this.insertionIndex = Math.min(text.length(), insertionIndex + 1); // sets insertionindex always to 0, cant't be
                                                                           // higher than text length
    }

    public void insertString(String s) {
        String begin = getText().substring(0, getInsertionIndex()); // substring that sets where in text the new string
                                                                    // would be
        String end = getText().substring(insertionIndex); // sets the start to insertionIndex
        this.text = begin + s + end;

        insertionIndex += s.length(); // sets insertionIndex to substring length
    }

    public void deleteLeft() { // need to fix this
        
        if (insertionIndex > 0) { // 
            StringBuilder s = new StringBuilder(text);

            s.deleteCharAt(insertionIndex - 1);
            text = s.toString();
            insertionIndex--;
        }

    }

    public void deleteRight() {
        StringBuilder s2 = new StringBuilder(text);

        if (insertionIndex < s2.length()) {
            s2.deleteCharAt(insertionIndex);
            text = s2.toString();
        }

    }

    public int returnLength() {
        return this.text.length();
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
        l.setText("");
        l.insertString("J");
        l.setInsertionIndex(1);
        l.deleteLeft();
        System.out.println(l);
    }

}
