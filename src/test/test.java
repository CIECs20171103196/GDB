package test;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class test extends JFrame {
 
 static BufferedImage image = null;
 static File file = null;
 public static void main(String args[])throws IOException{
    
    try{
    file = new File("C:/Users/Administrator/test/vip.jpg");
    image = ImageIO.read(file);
    }catch(IOException e){
    System.out.println("Error:"+e);
    }
    new test();
}

 public test() {
    setSize(1500,1000);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
 public void paint(Graphics g){
  
	super.paint(g);
    g.drawImage(image,0,0,null);
}
}