import java.util.*;
public class pattern1 {
    public static void main(String[] arg){
     Scanner sc= new Scanner(System.in);
     int a= sc.nextInt();
     for( int i=0;i<=a;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
       System.out.println();
     }
    }   
}

// output pattern
// *
// **
// ***
// ****
// *****
// ******
