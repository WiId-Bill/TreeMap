import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
  private static final int  maxWords = 3;
    public static void main(String[] args) {
      List<Person>people = new ArrayList<>();
      people.add(new Person("Ivan", "Vasilev Novicov", 73));
        people.add(new Person("Petya", "Ivanov", 5));
        people.add(new Person("Tanay", "Maximova-Vasilevskay", 1));
        people.add(new Person("Olya", "Petrova", 24));
        people.add(new Person("Alex", "Tern gffg gbfdgfg gfgfd", 23));
      people.add(new Person("Max", " Bean Beer", 3));
      people.add(new Person("Mikhail", "Pupkin-Nosov", 33));


      Comparator<Person> comparator = (Person o1, Person o2) -> {
        if (o1.namberwords() >= maxWords && o2.namberwords() >= maxWords){
          return Integer.compare(o2.getAge(), o1.getAge());
        }else {
          int surnameLength1 = o1.namberwords();
          int surnameLength2 = o2.namberwords();
          int surnameCompare = Integer.compare(surnameLength2, surnameLength1);
          if (surnameCompare == 0) {
            return Integer.compare(o2.getAge(), o1.getAge());
          } else {
            return surnameCompare;
          }
        }
      };

        System.out.println(people);
      people.removeIf(person -> person.getAge()<18);
        Collections.sort(people, comparator);
        System.out.println(people);
    }

}