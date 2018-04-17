package file;

import java.io.*;

public class InsertContent {
    public static void main(String[] args) throws IOException {
        //make a tmp file
        File tmp = File.createTempFile("tmp", null);
        tmp.deleteOnExit();

        //file stream
        try (FileInputStream fis = new FileInputStream(tmp);
             FileOutputStream fos = new FileOutputStream(tmp);
             RandomAccessFile raf = new RandomAccessFile("src/file/test.txt", "rw")) {
            //move the position
            raf.seek(15);
            //record the content after the pointer
            byte[] bbuf = new byte[1024];
            int hasread = 0;
            while ((hasread = raf.read(bbuf)) > 0) {
                fos.write(bbuf,0,hasread);
            }
            //relocate the pointer
            raf.seek(15);

            raf.write("we add something when we demonstration the InsertContent".getBytes());
            while ((hasread = fis.read(bbuf)) > 0) {
                raf.write(bbuf, 0, hasread);
            }
        }
    }
}
