package of5_1.kode;

import java.util.Comparator;

public class AnimalTypeComparator implements Comparator<Animal> {

    /**
     * Compares two animals.
     * @param o1 The first animal.
     * @param o2 The second animal.
     * @return -1 if the first animal is a dog and the second animal is a cat,
     * 1 if the first animal is a cat and the second animal is a dog,
     * 0 if the two animals are of the same type.
     */
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1 instanceof Dog && o2 instanceof Cat) {
            return -1;
        }
        if (o1 instanceof Cat && o2 instanceof Dog) {
            return 1;
        }
        return 0;
    }
    
}
