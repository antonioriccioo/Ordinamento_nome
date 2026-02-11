public class Studente {
    private String nome;
    private String cognome;
    private float media;

    public Studente(String nome, String cognome, float media) {
        this.nome = nome;
        this.cognome = cognome;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

        @Override
        public String toString() {
            return nome + " (" + cognome + ")" + ", valutazione " + media;
        }
    }
