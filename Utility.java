import java.util.Scanner;

public class Utility {
	static Scanner sc = new Scanner(System.in);
	
	static int getInt() {
		return sc.nextInt();
	}
	
	static int getInt(String str) {
		System.out.println(str);
		return sc.nextInt();
	}
	
	static String getString() {
		return sc.next();
	}
	
	static String getString(String str) {
		System.out.println(str);
		return sc.next();
	}
	
	static void printError(String str) {
		System.err.println(str);
	}
	
	static void print(String str) {
		System.out.println(str);
	}
}