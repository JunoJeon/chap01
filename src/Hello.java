public class Hello {
	

	public static void main(String[] args) {

		System.out.println("\033[2J");
		System.out.println("\033[31m");
		System.out.println("\033[44m");
		
		System.out.print("\033[10;20H");
		System.out.println("Hello Java!");

		System.out.print("\033[20;5H");
		System.out.println("Hello HTML!");

		System.out.println("\033[34m");
		System.out.println("\033[41m");
		
		System.out.print("\033[5;10H");
		System.out.println("Hello JavaScript!");

		System.out.print("\033[12;35H");
		System.out.println("Hello SQL!");

		System.out.println("\033[0m");

		

	}


}
