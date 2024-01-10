package practice;

public class Animal implements Comparable<Animal>{
    private String name;
    private int weight;
    private int year;

    public Animal(String name, int weight, int year) {
        this.name = name;
        this.weight = weight;
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }
    public int getYear() {
        return year;
    }

    public int compareTo(Animal y){
        return Integer.compare(this.getYear(), y.getYear());
    }

    @Override
    public String toString() {
        return getName() + ", " + getYear() + " y.o., " + getWeight() + " kg.";
    }
}
