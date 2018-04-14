package file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyinTest {
	public static void main(String[] args) {
		//Using the system.in as a input and  we can transform it from byte to char
		try (
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr)) {
			String line = null;
			while ((line = br.readLine()) != null) {
				if (line.equals("exit")) {
					System.exit(1);
				}
				System.out.println("输出的内容为：" + line);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
