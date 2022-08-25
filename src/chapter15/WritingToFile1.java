package chapter15;

import java.io.*;

public class WritingToFile1 {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            String userInput = bufferedReader.readLine();
            System.out.println("lINE:::: " + userInput.toUpperCase());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}