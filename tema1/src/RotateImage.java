//import org.imgscalr.Scalr;

//import javax.imageio.ImageIO;
//import java.awt.image.BufferedImage;
//import java.io.IOException;
//import java.util.Scanner;

import org.imgscalr.Scalr;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class RotateImage {
//    public static void main(String[] args)throws IOException {
//        System.out.println("Learn JAVA!!");
//        BufferedImage myImage=  ImageIO.read(new file pathname:);
//        BufferedImage rotateImage =Scalr.rotate(myImage, Scalr.Rotation.CW_90);
//        ImageIO.write()
//    }
   public static void main(String[] args) throws IOException {
       BufferedImage myImage = ImageIO.read(new File("C:\\Users\\Windows 10\\Desktop\\java20duke20logo.jpg"));
       BufferedImage rotateImage = Scalr.rotate(myImage,Scalr.Rotation.CW_90);
       ImageIO.write(myImage, "jpg", new File("C:\\Users\\Windows 10\\Desktop\\dukeTheJavaMascot.jpg"));

        }
    //dukeTheJavaMascot


}
