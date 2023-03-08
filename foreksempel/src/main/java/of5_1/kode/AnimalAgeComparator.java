package of5_1.kode;

import java.util.Comparator;

/**
 * Compares two animals by their age.
 * @param o1 The first animal.
 * @param o2 The second animal.
 * @return The difference between the ages of the animals.
 */
public class AnimalAgeComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getAge() - o2.getAge(); // Sort the animals by age in ascending order

    }
    
}
