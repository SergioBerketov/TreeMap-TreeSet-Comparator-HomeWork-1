import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> peoples = new ArrayList<>();
        peoples.add(new Person("Vadim", "Vadimov-Rafov", 22));
        peoples.add(new Person("Anastasia", "Galickaja-Yamskayja", 8));
        peoples.add(new Person("Leonid", "Dudin", 78));
        peoples.add(new Person("Maxim", "Maximov", 19));
        peoples.add(new Person("Alister", "Kvicha-Melinkovich-Savich",6));

        Comparator<Person> personComparator = (o1, o2) -> {

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
        };

        Collections.sort(peoples, personComparator);
        System.out.println(peoples);
    }
}