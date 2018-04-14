package file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcessDemo {
	public static void main(String[] args) throws IOException {
		/* transform a getErrorStream to a bufferedReader */

		Process p = Runtime.getRuntime().exec("javac");

		try (
				BufferedReader br = new BufferedReader(new InputStreamReader(p.getErrorStream())))
		{
			System.out.println("over");
			String buff = null;
			//use  while loop to read gerErrorStream
			while ((buff = br.readLine()) != null) {
				System.out.println(buff);
				System.out.println("over");

			}
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}
