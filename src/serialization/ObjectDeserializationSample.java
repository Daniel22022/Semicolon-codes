package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ObjectDeserializationSample {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("Bob");
         ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ) {
         Dog dog=  (Dog)objectInputStream.readObject();
            System.out.println(dog);
        } catch (IOException |ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
