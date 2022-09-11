import java.util.Scanner;
import java.lang.Math;
class triangle{
	public static void main(String[] args){
		Scanner side = new Scanner(System.in);
		System.out.print("Enter the first side of triangle : ");
		int a = side.nextInt();
		System.out.print("Enter the second side of triangle : ");
		int b = side.nextInt();
		System.out.print("Enter the third side of triangle : ");
		int c = side.nextInt();
		float s = (a+b+c)/2;
		double ar = Math.pow(s*(s-a)*(s-b)*(s-c),0.5);
		System.out.print("Area of triangle : "+ar);
}
}