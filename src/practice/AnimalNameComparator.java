package practice;

import java.util.Comparator;

public class AnimalNameComparator implements Comparator<Animal> {

    public int compare (Animal n1, Animal n2){
        return n1.getName().compareTo(n2.getName());
    }
}
