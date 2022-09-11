import java.util.Scanner;
class Leapyear{
	public static void main(String[] args){
		Scanner year = new Scanner(System.in);
		System.out.print("Enter the year :");
		int k = year.nextInt();
		String h = ((k%400 == 0) || (k%4 == 0 && k%100 == 0)) ? "Leap year." : "Not a leap year.";
		System.out.print(h);
}
}