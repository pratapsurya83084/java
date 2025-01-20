
import java.util.Arrays;

class Players {
    String name;
    int noofinning;
    int notout;
    int Totalrun;

    Players(String name, int noofinning, int notout, int Totalrun) {
        this.name = name;
        this.noofinning = noofinning;
        this.notout = notout;
        this.Totalrun = Totalrun;

    }

    void display() {
        System.out.println("Name : " + name + "\n" + " No of innings : " + noofinning + "\n" + " Not out : "
                + notout + "\n" + " Total runs : " + Totalrun);
    }

}

public class CricketTeamApp {

    public static void main(String[] args) {

        Players[] team = {

                new Players("ok", 10, 55, 5),
                new Players("om", 100, 5, 5),
                new Players("pratap", 11, 15, 5)

        };

        for (Players players : team) {
            players.display();

        }

    }
}
