import java.util.Scanner;
class four{
	public static void main(String[] args){
		Scanner number = new Scanner(System.in);
		System.out.print("Enter the number to mutiply it by 8 : ");
		int n = number.nextInt();
		int c = n<<3;
		System.out.print("Your answer is : "+c);
}
}