package file;

import java.io.*;

public class ReadObject {
    public static void main(String[] args) {
    //create a objectInputStream
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src//file//object.txt"))) {
            Person per = (Person) ois.readObject();
            System.out.println("name:" + per.name + "  age:" + per.age);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
