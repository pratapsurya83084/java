public class butterflyPattern {
   public static void main(String[] args){
  
    int n=4;

for (int i=1;i<=n;i++) { //column
       for (int j=1;j<=i;j++) {  //row
        System.out.print("*"+" ");
       }         
    System.out.println();
    
    }
    

    for (int i=n;i>=1;i--) { //column
        for (int j=1;j<=i;j++) {  //row
         System.out.print("*"+" ");
        }         
     System.out.println();
     
     }
    
//print opposite of the above
// right side pattern

for (int i=1;i<=n;i++) { //column
    for (int j=1;j<=i;j++) {  //row
     System.out.print("*"+" ");
    }         
 System.out.println();
 
 }
 
 for (int i=n;i>=1;i--) { //column
     for (int j=1;j<=i;j++) {  //row
      System.out.print("*"+" ");
     }         
  System.out.println();
  
  }



   }  
}
