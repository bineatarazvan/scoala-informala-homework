package ro.sci.razvan.mar07;

import java.io.*;

public class UtilFile {

    public static final String inFilePath = "SRC\\main\\java\\ro.sci.razvan\\mar07\\file1.txt";
    public static final String outFilePath = "SRC\\main\\java\\ro.sci.razvan\\mar07\\file2.txt";

    public static void writeLine(String content){
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(outFilePath,true), "utf-8"))) {
            writer.write(content);
            ((BufferedWriter) writer).newLine();
        } catch (FileNotFoundException e){
            System.out.println( "Error! File was not found");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
