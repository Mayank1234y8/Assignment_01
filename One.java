class hello{
	private static double rate;
	private int age;

	void setAge(int Age){
		this.age = age;
}
	int getAge(){
		return this.age;
}
	static void setRate(double r){
		rate = r;
}
	static double getRate(){
		return rate;
}
}
class One{
	public static void main(String[] args){
		hello h1 = new hello();
		h1.setRate(2398.34);
		System.out.println(hello.getRate());
		
}
}