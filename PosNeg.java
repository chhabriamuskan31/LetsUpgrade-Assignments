import java.util.*;

public class PosNeg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
		System.out.println("Please Write any number");
		int num =sc.nextInt();
		if(num<0)
		{
			System.out.println("Number is negative");
		}
		else if(num==0)
		{
			System.out.println("Number is zero");
		}
		else
		{
			System.out.println("Number is Positive");
		}
		
	}
}