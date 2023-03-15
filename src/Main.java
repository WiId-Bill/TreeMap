import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      List<Person>people = new ArrayList<>();
      people.add(new Person("Ivan", "Vasilev Novicov", 3));
        people.add(new Person("Petya", "Ivanov", 5));
        people.add(new Person("Tanay", "Maximova-Vasilevskay", 1));
        people.add(new Person("Olya", "Petrova", 4));
        people.add(new Person("Alex", "Tern", 3));
        System.out.println(people);
        Collections.sort(people);
        System.out.println(people);
    }

}