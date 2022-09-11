import java.util.Scanner;
class character{
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		System.out.print("Enter the character : ");
		char c = a.next().charAt(0);
		if(( c >= 'A' & c <= 'Z' ) ||(c >='a' & c<= 'z' ))
		{
			System.out.print("It is an alphabet.");
		}
		else if( c >= '0' & c <= '9' )
		{
			System.out.print("It is a digit.");
		}
		else
		{
			System.out.print("It is an special character.");
		}
}
}