package chapter15;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WritingToFiles2 {
    public static void main(String[] args) {
        try(PrintWriter writer = new PrintWriter("C:\\Download\\SemicolonClassworks\\src\\chapter15\\test.txt")) {
            writer.println("my first line");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
