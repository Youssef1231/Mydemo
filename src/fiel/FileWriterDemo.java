package fiel;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) {
		//Demonstrate the FileWriter
		try (
				FileWriter fw = new FileWriter("src\\fiel\\peom.txt")) {
			fw.write("李白-静夜思\r\n");
			fw.write("\r\n");
			fw.write("窗前明月光，\r\n");
			fw.write("疑是地上霜。\r\n");
			fw.write("举头望明月，\r\n");
			fw.write("低头思故乡。\r\n");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
