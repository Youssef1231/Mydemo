package file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args)
			throws IOException {
		//This will demonstration the File Class
		//First of all mk a file
		File file = null;
		try {
			file = new File("ew.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
		file.createNewFile();
		System.out.println(file.mkdir());
		String[] fileList = file.list();
//		for (String fileName : fileList) {
//			System.out.println(fileName);
//		}


		System.out.println(file);
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getAbsoluteFile());
		System.out.println(file.getAbsoluteFile().getParent());
//		file.deleteOnExit();
		File newFile = new File(System.currentTimeMillis() + "");
		System.out.println(newFile.getName());
		System.out.println(newFile.getAbsolutePath());
		File[] roots = File.listRoots();
		for (File root : roots) {
			System.out.println(root);
		}

	}
}
