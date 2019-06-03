package ro.sci.razvan.mar10;
/**
 * Read and save the contet of the file in a Array.
 * we sort our array, call our method writeInFil how have the array as a parameter
 *
 *
 * @author  Razvan B
 * @see     java.io.InputStream
 * @see     java.io.OutputStream
 * @date   12/03/2019
 */

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.file.Files.list;
import static java.nio.file.Files.newBufferedReader;

public class FileUtile {

    public static final String csvFileIn = "C:\\Users\\Windows 10\\IdeaProjects\\scoala-informala-homework\\" +
            "SRC\\main\\java\\ro.sci.razvan\\mar10\\fileIn.csv";
    public static final String csvFileOut = "C:\\Users\\Windows 10\\IdeaProjects\\scoala-informala-homework\\" +
            "SRC\\main\\java\\ro.sci.razvan\\mar10\\fileOut.csv";

    public static void writeInFile(List<String> namesList) {

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(csvFileOut, true), "utf-8")))
        {
            for(String name : namesList){
                System.out.println(name);
                writer.write(name);
                ((BufferedWriter) writer).newLine(); // newLine - to go to the next line
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error! File was not found");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteContent(){
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(csvFileOut);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


}