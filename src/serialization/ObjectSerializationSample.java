package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerializationSample {
    public static void main(String[] args) {
        Dog dog = new Dog("Bob", 10);
        try (
                FileOutputStream fos = new FileOutputStream("Bob");
                ObjectOutputStream out = new ObjectOutputStream(fos);)
        {
            out.writeObject(dog);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
