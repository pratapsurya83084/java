package tymark;

public class TYMarks {
    public int theory;
    public int practicals;

    public TYMarks(int theory, int practicals) {
        this.theory = theory;
        this.practicals = practicals;
    }

    public int getComputerTotal() {
        return theory + practicals;
    }
}