package com.qa.programming;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ImageHandling {

    public static void main(String[] args) throws IOException {
        try {
            URL url = new URL("https://images-eu.ssl-images-amazon.com/images/G/31/img21/Wireless/cnnjpp/DesktopGateway_CategoryCard_758X608._SY608_CB639629275_.jpg");
            BufferedImage bf = ImageIO.read(url);

            ImageIO.write(bf, "jpg" , new File("./images/laptop.jpg"));
            ImageIO.write(bf, "gif" , new File("./images/laptop.gif"));
            ImageIO.write(bf, "png" , new File("./images/laptop.png"));
            ImageIO.write(bf, "bmp" , new File("./images/laptop.bmp"));


        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
