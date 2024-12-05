public class Patient {

    private int id;
    private String vorname;
    private String nachname;
    private String geburtsdatum;
    private String diagnose;

    //Konstruktor
    public Patient(int id, String vorname, String nachname, String geburtsdatum, String diagnose) {
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
        this.diagnose = diagnose;
    }
}
