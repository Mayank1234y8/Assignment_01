import java.util.Scanner;
class factorial{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int f = 1;
		for( int i=a;i>0;i--){
			f = f*i;
		}
		System.out.print("Factorial :"+f);
}
}