import java.util.*;
// Question 1
class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.age, otherPerson.age);
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 20));
        people.add(new Person("Abhi", 20));

        // Sorting based on natural ordering (age)
        Collections.sort(people);
        System.out.println("Sorted by age (natural ordering):");
        System.out.println(people);

        // Sorting using a Comparator to sort by name
        Comparator<Person> byName = Comparator.comparing(Person::getName);
        Collections.sort(people, byName);
        System.out.println("\nSorted by name:");
        System.out.println(people);
    }
}
