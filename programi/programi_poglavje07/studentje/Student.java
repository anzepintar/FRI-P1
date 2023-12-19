
/*
 * Objekt tega razreda predstavlja študenta (rednega ali izrednega).
 */

public class Student {
    private String ip;
    private String vpisna;
    private int stroskiBivanja;

    public Student(String ip, String vpisna, int stroskiBivanja) {
        this.ip = ip;
        this.vpisna = vpisna;
        this.stroskiBivanja = stroskiBivanja;
    }

    public String vrniIP() {
        return this.ip;
    }

    // Vrne mesečne stroške študija za študenta <this>.
    public int stroski() {
        return this.stroskiBivanja;
    }
}
