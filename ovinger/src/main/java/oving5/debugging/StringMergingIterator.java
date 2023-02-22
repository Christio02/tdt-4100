package oving5.debugging;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StringMergingIterator implements Iterator<String> {

	private Iterator<String> first;
	private Iterator<String> second;
	private boolean turnSwitch;

	public StringMergingIterator(Iterator<String> first, Iterator<String> second) {
		this.first = first;
		this.second = second;
		this.turnSwitch = false; // should be initzialised as false
	}

	@Override
	public boolean hasNext() {
		return first.hasNext() || second.hasNext();
	}

	@Override
	public String next() {

		if (!hasNext()) {
			throw new NoSuchElementException();
		}

		String result = null;

		// if (!first.hasNext()) {  // looks like the first iterator string gets replaced by second iterator string
		// 	result = second.next(); // should be second.next() since first does not have any more elements
			
		// } else if (!second.hasNext()) {
		// 	result = first.next(); // should be first.next() since second does not have any more elements
			
		// } else {
		// 	if (turnSwitch) {
		// 		result = second.next(); // same here
		// 		turnSwitch = false;
		// 	}
		// 	if (!turnSwitch) {
		// 		result = first.next(); // changed
		// 		turnSwitch = true;
		// 	}
		// }
		if (turnSwitch && second.hasNext()) {
            result = second.next();
            turnSwitch = false;
        } else if (!turnSwitch && first.hasNext()) {
            result = first.next();
            turnSwitch = true;
        } else if (second.hasNext()) {
            result = second.next();
        } else if (first.hasNext()) {
            result = first.next();
        }
		return result;
	}

}
