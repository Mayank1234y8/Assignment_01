import java.util.Scanner;
class area{
	public static void main(String[] args){
		Scanner radius = new Scanner(System.in);
		System.out.print("Enter the radius in cm=");
		int r = radius.nextInt();
		double ar = (3.14)*(r*r);
		System.out.print("Area of circle = "+ar);		
}
}