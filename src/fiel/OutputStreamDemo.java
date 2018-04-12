package fiel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {
	public static void main(String[] args) {

		//we can ignore the finally by using the try(),and in the last sentence we could not use the ";"
		try (
			//new a input source and output source
			FileInputStream fis = new FileInputStream("src\\fiel\\OutputStreamDemo.java");
			FileOutputStream fos = new FileOutputStream("src\\fiel\\newFile.txt"))
			// make a container
		{	byte[] bbuf = new byte[32];
			//indicator
			int hasRead = 0;
			//while loop
			while ((hasRead = fis.read(bbuf)) > 0) {
				fos.write(bbuf, 0, hasRead);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}
}
