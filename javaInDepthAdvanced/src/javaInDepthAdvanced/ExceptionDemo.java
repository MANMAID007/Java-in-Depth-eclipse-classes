package javaInDepthAdvanced;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo {
	public static void main(String[] args) throws FileNotFoundException {	
		System.out.println("\nInside main ...");		
		try {
			share();
			System.out.println("After invoking share...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("main: filenotfoundexception...");
		} finally {
			System.out.println("inside main's finally");
		}
		System.out.println("\nEnd of main ...");
	}

	private static void share() throws FileNotFoundException {
		System.out.println("\nInside share ...");
		
		try {
			HttpConnect.send(0, "hello", "http://www.goodsnips.com");
			System.out.println("After invoking send...");
		} catch (FileNotFoundException e) {
			System.out.println("share: filenotfoundexception...");
			throw e;
		} catch (IOException e) {
			System.out.println("Connecting to different server...");
		} finally {
			System.out.println("Inside share's finally...");
		}
		
		System.out.println("\nEnd of share ...");
	}
}
