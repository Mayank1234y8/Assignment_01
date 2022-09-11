import java.util.Scanner;
class volume{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius in cm= ");
		int r = sc.nextInt();
		System.out.print("Enter the height in cm = ");
		int h = sc.nextInt();
		double vol = (3.14)*(r*r)*h;
		System.out.print("Volume of cylinder = "+vol);		
}
}