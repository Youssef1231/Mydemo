package fiel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {

		//demonstrate the PrintStream
		try (
				FileOutputStream fos = new FileOutputStream("src\\fiel\\test.txt");
				PrintStream ps = new PrintStream(fos)
		) {
			ps.println("普通字符串");
			ps.println(new PrintStreamDemo());
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
