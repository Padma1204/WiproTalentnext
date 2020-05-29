import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) 
	{	Scanner ob = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = ob.nextInt();
		if(num>0)
			System.out.println("POSITIVE NUMBER");
		else if(num<0)
			System.out.println("NEGATIVE NUMBER");
		else
			System.out.println("ZERO");
	}

}
