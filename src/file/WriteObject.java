package file;

import java.io.*;

public class WriteObject implements Serializable {
    public static void main(String[] args) {

        //new stream
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src//file//object.txt"))) {
            Person p = new Person("Wukong Sun", 200);
            oos.writeObject(p);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
