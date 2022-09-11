import java.util.Scanner;
class divisibility{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int s = sc.nextInt();
		if( s%3 ==0)
		{
			System.out.print("It is divisible by 3.");
		}
		else
		{
			System.out.print("It is not divisible by 3.");
		}
}
}