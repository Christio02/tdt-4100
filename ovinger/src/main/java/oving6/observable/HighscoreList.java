package oving6.observable;

import java.util.ArrayList;
import java.util.List;

public class HighscoreList {

    private int maxSize;
    private List<Integer> results = new ArrayList<>();

    public HighscoreList(int maxSize) {

    }
    
    public int size() {
        return this.results.size();
    }

    public int getElement(int pos) {
        return this.results.get(pos);
    }

    public void addResult(int result) {
        for (Integer elem : results) {
            if (result < results.get(elem)) {
                throw new IllegalArgumentException("Can't add a result that's worse than resultlist!");
            }
            else if (results.size() == maxSize) {
                if (result > results.get(elem)) {
                    results.remove(elem);
                    results.add(elem);
                }

            }
        }
    }

    public void addHighscoreListListener(HighscoreListListener listener) {
        this.addHighscoreListListener(listener);
    }

}
