package utils;

import java.util.Scanner;

public class MyScanner {
	static Scanner scanner = new Scanner(System.in);
	public static int scInt() {
		boolean stop = false;
		int result = 0;
		do {
			try {
				result = Integer.parseInt(scanner.next());
				scanner.nextLine();
				stop = true;
			} catch (NumberFormatException e) {
				System.err.println("Ký tự nhập vào ko phải là số nhập lại!");
			}
		} while (!stop);
		
		return result;
	}
	
	public static float scFloat() {
		boolean stop = false;
		float result = 0;
		do {
			try {
				result = Float.parseFloat(scanner.next());
				scanner.nextLine();
				stop = true;
			} catch (NumberFormatException e) {
				System.err.println("Ký tự nhập vào ko phải là số nhập lại!");
			}
		} while (!stop);
		return result;
	}
	
	public static String scString() {
		return scanner.nextLine();
	}
	
	public static void close() {
		scanner.close();
	}
}
