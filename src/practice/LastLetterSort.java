package practice;

import java.util.Comparator;

public class LastLetterSort implements Comparator<Animal> {

    public int compare (Animal l1, Animal l2){

        return l1.getName().substring(l1.getName().length()-1).compareTo
                (l2.getName().substring(l2.getName().length()-1));
    }
}
