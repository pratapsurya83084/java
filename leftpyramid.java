
public class leftpyramid{
    public static void main(String[] args) {
    
        int n=5;
        // int number=1;

    //     for (int i=1;i<=n;i++) {
    //         for (int j=1;j<=i;j++) {
    //             System.out.print(number+" ");
    //             number++;
    //         }
    //         System.out.println();
    //     }
    

for (int i=1;i<=n;i++) {
   for ( int j=1;j<=i;j++) {
    int sum=i+j;
       if (sum%2==0) {
        System.out.print("1"+" ");
       }else{
        System.out.print("0"+" ");
  }
 
   }
   System.out.println();
}
}
}
