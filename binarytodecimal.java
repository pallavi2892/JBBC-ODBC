import java.util.Scanner;		
class binarytodecimal
{
	public static void main(String args[])
	{
		int bin, dec=,k=1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the binary number : ");
		bin=scanner.nextInt();
		while(bin!=)
		{ 
			dec=dec+ (bin%10)*k;     // extracting the last digit of a binary number and multiplying it with 2 <sup> digits place value</sup>
			k*=2;
			bin/=10;     // removing the last digit of a binary number 
		}
		System.out.println("Decimal number = "+dec);
	}
}