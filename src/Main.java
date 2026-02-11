import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Studente> studenti = new ArrayList<>();
        studenti.add(new Studente("Antonio", "Riccio", 6.7f));
        studenti.add(new Studente("Riccardo", "De lazzari", 7.6f));
        studenti.add(new Studente("Alex", "Pizzolo", 6.9f));
        System.out.println("Lista prima dell'ordinamento: ");
        for (Studente s : studenti) {
            System.out.println(s);
        }
        Collections.sort(studenti);

        System.out.println("\nLista dopo l'ordinamento: ");
        for (Studente s : studenti) {
            System.out.println(s);
        }
        Collections.sort(studenti, new Media());
        System.out.println("\nLista dopo l'ordinamento per media: ");
        for (Studente s : studenti) {
            System.out.println(s);
        }
    }
}
