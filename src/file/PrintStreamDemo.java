package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {

		//demonstrate the PrintStream
		try (
				FileOutputStream fos = new FileOutputStream("src\\file\\test.txt");
				PrintStream ps = new PrintStream(fos)
		) {
			ps.println("普通字符串");
			ps.println(new PrintStreamDemo());
		} catch (IOException ioe) {
			ioe.printStackTrace();

		}
//		use the setOut and system.out.println method doing it again
		try(
				PrintStream ps1 = new PrintStream(new FileOutputStream("src\\file\\text2.txt")))

		{
			System.setOut(ps1);
			System.out.println("普通字符串");
			System.out.println(new PrintStreamDemo());

		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
