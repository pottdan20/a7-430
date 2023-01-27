package sort;

public class Sort {

    /**
     * Sorts the given list of Persons based on their age.
     */
    public static Person[] sort(Person[] people) {
        for (int i = 1; i < people.length; i++) {
            for (int j = i; j < people.length; j++) {
                if (people[j - 1].age > people[j].age) {
                    Person temp = people[j];
                    people[j] = people[j - 1];
                    people[j - 1] = temp;
                }
            }
        }

        return people;
    }

    public record Person (String name, int age, double height) {}
}
