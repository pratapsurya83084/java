
interface cubs {

    public void showcube();
}

class cubofno implements cubs {
    int n;

    public cubofno(int n) {
        this.n = n;
    }

    public void showcube() {
        System.out.println("The cube of " + n + " is : " + n * n * n);
    }

}

public class cub {

    public static void main(String[] args) {
        cubofno obj = new cubofno(2);
        obj.showcube(); // Output: The cube of 10 is : 1000
    }
}
