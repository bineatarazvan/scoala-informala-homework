package ro.sci.razvan.mar07;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Files.newBufferedReader;
import static ro.sci.razvan.mar07.UtilFile.*;


public class Main {
    /**
     * Bineata Razvan
     * This is the Main class
     * @param args
     */
        public static void main(String[] args) {
            String readLine;
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inFilePath))) {
                while ((readLine = bufferedReader.readLine()) != null) {
                    System.out.println(readLine);
                    writeLine(readLine);
                }
            } catch (IOException e) {
                System.out.println("Error.");
                e.printStackTrace();
            }
        }
}