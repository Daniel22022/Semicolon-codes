package chapter15;

import java.io.*;

public class ReadingFromFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("C:\\Download\\SemicolonClassworks\\src\\chapter15\\test.txt");
            BufferedReader  bufferedReader = new BufferedReader(fileReader);
           String sentence = bufferedReader.readLine();
            System.out.println(sentence);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

