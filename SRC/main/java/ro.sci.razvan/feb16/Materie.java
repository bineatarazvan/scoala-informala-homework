package ro.sci.razvan.feb16;

public class Materie {
    private int codMaterie;
    private String nameMaterie;
    private double noteMaterie;

    public int getCodMaterie() { return codMaterie; }
    public void setCodMaterie(int codMaterie) { this.codMaterie = codMaterie; }
    public String getNameMaterie() { return nameMaterie; }
    public void setNameMaterie(String nameMaterie) { this.nameMaterie = nameMaterie; }
    public double getNoteMaterie() { return noteMaterie; }
    public void setNoteMaterie(double noteMaterie) { this.noteMaterie = noteMaterie; }

    public Materie() { }
    public Materie(int codMaterie, String nameMaterie, double noteMaterie) {
        this.codMaterie = codMaterie;
        this.nameMaterie = nameMaterie;
        this.noteMaterie = noteMaterie;
    }
}
