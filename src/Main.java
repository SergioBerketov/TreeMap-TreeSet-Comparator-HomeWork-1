import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> peoples = new ArrayList<>();
        peoples.add(new Person("Vadim", "Vadimov-Rafov", 22));
        peoples.add(new Person("Anastasia", "Galickaja-Yamskayja", 8));
        peoples.add(new Person("Leonid", "Dudin", 78));
        peoples.add(new Person("Maxim", "Maximov", 19));
        peoples.add(new Person("Alister", "Kvicha-Melinkovich-Savich",6));

        Collections.sort(peoples, new PersonNobleComparator());
        System.out.println(peoples);
    }
}