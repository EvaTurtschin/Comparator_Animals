package practice;

import java.util.Comparator;

public class WeightComparator implements Comparator<Animal> {

    public int compare (Animal w1, Animal w2){
        return Integer.compare(w1.getWeight(), w2.getWeight());
    }
}
