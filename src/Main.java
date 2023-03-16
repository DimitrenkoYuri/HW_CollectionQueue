import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        List<Person> people = generateClient();
        Queue<Person> attr = new LinkedList<>(people);
        while (!attr.isEmpty()) {
            Person person = attr.poll();
            //Person person = attr.poll();
            int quantityTickets = person.getQuantityTickets();
            quantityTickets = quantityTickets - 1;
            person.setQuantityTickets(quantityTickets);
            System.out.printf("\n%s %s прокатился на аттракционе, у него осталось %d билетов", person.getName(), person.getSureName(), quantityTickets);
            if (quantityTickets > 0) {
                attr.offer(person);
            }
        }

    }

    private static List<Person> generateClient() {
        return List.of(
                new Person("Zahar", "Big", 3),
        new Person("Alex", "Black", 2),
        new Person("Panteley", "Smurf", 7),
        new Person("George", "Flash", 8),
        new Person("Yurii", "Tooth", 4),
        new Person("John", "Bear", 5)
        );

    }
}