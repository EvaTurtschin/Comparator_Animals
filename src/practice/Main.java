package practice;

import comparator_interface.Author;

import java.util.Arrays;

public class Main {
    /*
    Создать класс Animal c полями name, weight, color. Используя компараторы вывести на экран в классе
    Main список животных, упорядоченный по:
    - названию
    - по весу
    - список названий животных, упорядоченный по возрастанию последней буквы названия.
    Wolf, Bear, Elephant, Snake, Fox, Flamingo, Koala
     */
    public static void main(String[] args) {

        Animal animal1 = new Animal("Wolf", 30, 3);
        Animal animal2 = new Animal("Bear", 90, 4);
        Animal animal3 = new Animal("Elephant", 160, 4);
        Animal animal4 = new Animal("Snake", 2, 2);
        Animal animal5 = new Animal("Fox", 4, 5);
        Animal animal6 = new Animal("Flamingo", 3, 3);
        Animal animal7 = new Animal("Koala", 6, 6);

        System.out.println("Before sorting:");

        Animal [] animals = {animal1, animal2, animal3, animal4, animal5, animal6, animal7};

        for (Animal animal : animals){
            System.out.println(animal);}

        System.out.println();
        System.out.println("Sort by age:");
        Arrays.sort(animals);
        for (Animal animal : animals){
            System.out.println(animal);}

        System.out.println();
        System.out.println("Sort by Animal name:");
        Arrays.sort(animals, new AnimalNameComparator());
        for (Animal animal : animals){
            System.out.println(animal);}

        System.out.println();
        System.out.println("Sort by weight:");
        Arrays.sort(animals, new WeightComparator());
        for (Animal animal : animals){
            System.out.println(animal);}

        System.out.println();
        System.out.println("Sort by last letter:");
        Arrays.sort(animals, new LastLetterSort());
        for (Animal animal : animals){
            System.out.println(animal);}

    }
}
