package file;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo {
	public static void main(String[] args) {
		//new RandomAccess

		try (
				RandomAccessFile ra = new RandomAccessFile("src\\file\\RandomAccessDemo.java", "r")) {
			System.out.println("Initial position is ：" + ra.getFilePointer());
			ra.seek(300);
			System.out.println("And now the position is ：" + ra.getFilePointer());
			// read from 300 position
			byte[] bbuf = new byte[1024];
			int hasRead = 0;
			while ((hasRead = ra.read(bbuf)) > 0) {
				System.out.println(new String(bbuf, 0, hasRead));
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		try (
				RandomAccessFile raf = new RandomAccessFile("src\\file\\out.txt", "rw")) {
			raf.seek(raf.length());
			raf.write("This is added thing\r\n".getBytes());
//			System.out.println(raf);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
