
public class rhombus {
public static void main(String[] args) {
    
//1 to n
//spaces
//star print
int n=5;

for (int i=1;i<=n;i++) {
   for(int j=1;j<=n-i;j++) {
        //space
       System.out.print(" ");
    }
    //stars
    for (int j=1;j<=5;j++ ) {
        // if (j==5) {
            System.out.print("*");
        // }
      
    }
    System.out.println();
}

}    
}
