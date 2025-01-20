package symark;

public class SYMarks {
    public int computerTotal;
    public int mathsTotal;
    public int electronicsTotal;

    public SYMarks(int computerTotal, int mathsTotal, int electronicsTotal) {
        this.computerTotal = computerTotal;
        this.mathsTotal = mathsTotal;
        this.electronicsTotal = electronicsTotal;
    }

    public int getComputerTotal() {
        return computerTotal;
    }
}