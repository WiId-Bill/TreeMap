import java.util.Comparator;

public class PersonSurnameComparator implements Comparator<Person> {
    protected int maxWords;
    public PersonSurnameComparator(int maxWords) {
        this.maxWords = maxWords;
    }
    @Override
    public int compare(Person o1, Person o2) {
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
    }
}
