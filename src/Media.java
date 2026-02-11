import java.util.Comparator;

public class Media implements Comparator<Studente> {

    @Override
    public int compare(Studente o1, Studente o2) {
        return Double.compare(o2.getMedia(),o1.getMedia());
    }
}
