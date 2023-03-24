package labwork;
import java.util.Scanner;
public class pattern_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
System.out.print("Input the numbers:");
int n = in.nextInt();
for(int i=0;i<=n;i++)
{
	for(int j=5; j>=i; j--)
	{
		System.out.print("@");
	}
	System.out.println();
}
	}

}
