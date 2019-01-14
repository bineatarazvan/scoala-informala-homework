/**
 * In this class we have acces a image from our computer
 * we roate the image to be streight and we save the image like that
 *Created 14Ian 2019
 * @RazvanB
 */

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
