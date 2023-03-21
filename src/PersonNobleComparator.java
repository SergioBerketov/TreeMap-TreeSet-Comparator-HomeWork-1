import java.util.Comparator;

public class PersonNobleComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {

        String str1 = o1.surname;
        String[] surnamesCount1 = str1.split("-");


        String str2 = o2.surname;
        String[] surnamesCount2 = str2.split("-");

        if (surnamesCount1.length > surnamesCount2.length) {
            return -1;
        } else if (surnamesCount1.length < surnamesCount2.length) {
            return 1;
        } else {
            return Integer.compare(o2.age, o1.age);
        }
    }
}
