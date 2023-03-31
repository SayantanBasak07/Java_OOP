import java.util.Scanner;

class rectangle2{
	public static void main(String x[])
	{
		System.out.println("Enter length and breadth");
		Scanner s1=new Scanner(System.in);
		int l=s1.nextInt();
		int b=s1.nextInt();
		int area=l*b;
		System.out.println("Area of rectangle = "+area+" sq. units");
		int peri=l+b;
		System.out.println("Perimeter of Rectangle = "+peri+" units");
	}
}