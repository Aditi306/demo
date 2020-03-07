import java.util.Scanner;
class Calculator{

	public static void main(String[] args)
	{
		System.out.println("");
		System.out.println("");
		System.out.println("--SIMPLE CALCULATOR USING IF-ELSE LADDER--");
		
		calc();
	}
	public static void calc()
	{
		int ch,z;
		double a,b;
		Scanner in = new Scanner(System.in);
		do
		{
			System.out.println("--Menu--");
			System.out.println("Choose the operation you want to perform");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Modullus");
			System.out.println("Enter Choice");
			ch = in.nextInt();
			if(ch>=1 || ch<=5)
			{
				System.out.println("Enter the first number");
				a=in.nextDouble();
				System.out.println("Enter the second number");
				b=in.nextDouble();
			}
			else
			{
				System.out.println("Enter a valid choice!");
				break;
			}
			
			if(ch==1)
			{
				System.out.println("Addition of "+ a +" and "+ b +" is " + (a+b));
			}
			else if(ch==2)
			{
				System.out.println("Subtraction of "+a+" and "+b+" is "+(a-b));
			}
			else if(ch==3)
			{
				System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));
			}
			else if(ch==4)
			{	
				if(b==0)
				{
					System.out.println("Error!!! In Division denominator cannot be 0!");
				}
				else
				{
					System.out.println("Diviion of "+a+" and "+b+" is "+(a/b));
				}
			}
			else if(ch==5)
			{
				System.out.println("Modullo of "+a+" and "+b+" gives "+(a%b));
			}
			else
			{
				break;
			}
			System.out.println("Do you want to continue?1.Yes 2.No");
			z=in.nextInt();
		}while(z==1);
	}
}

