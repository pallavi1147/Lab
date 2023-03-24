package labwork;
import java.util.Scanner;
public class cube_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int i,n;
 System.out.print("Input number of terms:");
 Scanner in = new Scanner(System.in);
 n= in.nextInt();
   for(i=1;i<=n;i++)
   {
	   System.out.println("Numer is : " +i+" and cube of "+i+" is : "+(i*i*i));
   }
	}

}
