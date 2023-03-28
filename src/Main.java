import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      List<Person>people = new ArrayList<>();
      people.add(new Person("Ivan", "Vasilev Novicov", 73));
      people.add(new Person("Petya", "Ivanov", 5));
      people.add(new Person("Tanay", "Maximova-Vasilevskay", 1));
      people.add(new Person("Olya", "Petrova", 24));
      people.add(new Person("Alex", "Tern gffg gbfdgfg gfgfd", 23));
      people.add(new Person("Max", "Bean Beer", 3));
      people.add(new Person("Mikhail", "Pupkin-Nosov", 33));


      System.out.println(people);
      people.removeIf(person -> person.getAge()<18);
      Collections.sort(people, new PersonSurnameComparator(2));
      System.out.println(people);
    }

}