package ro.sci.razvan.mar10;
/**
 * we create method writeInFil how have the array as a parameter,
 * in this methot we copy the content of the aaray in a csvFile
 *
 *
 * @author  Razvan B
 * @see     java.io.InputStream
 * @see     java.io.OutputStream
 * @date   12/03/2019
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static ro.sci.razvan.mar10.FileUtile.*;


public class Main {
    public static void main(String[] args) {
        String readLine;
        List<String> nameList = new ArrayList<String>();
        String month = "06";

        FileUtile.deleteContent();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FileUtile.csvFileIn))) {
            while ((readLine = bufferedReader.readLine()) != null) {

                String[] lineValues = readLine.split(",");
                String[] dateOfBirth = lineValues[2].split("/");
                if(month.equals(dateOfBirth[1])) {
                    nameList.add(lineValues[0] + " " + lineValues[1]);
                }
            }
        } catch (IOException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }

        if(!nameList.isEmpty()) {
            Collections.sort(nameList);
            FileUtile.writeInFile(nameList);
        }
    }
}
