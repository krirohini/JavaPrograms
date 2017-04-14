package com.datastructure.programs.list;

	import java.awt.*;
	import java.awt.image.BufferedImage;

	import java.io.*;

	import javax.imageio.ImageIO;
	import javax.swing.JFrame;

	class ImageRotation {
	   BufferedImage image;
	   int width;
	   int height;
	   
	   public void imageRotation() {
	      try {
	         File input = new File("seal.jpg");
	         image = ImageIO.read(input);
	         width = image.getWidth();
	         height = image.getHeight();
	         
	              
	         for(int i=0; i<height; i++){	         
	            for(int j=0; j<height; j++){     
	       
	               Color c = new Color(image.getRGB(i, j));
	               Color ctemp = c;
	               Color c90 = new Color(image.getRGB(j, i));
	               c = c90;
	               c90 = ctemp;
	               
	               System.out.println(image);
	            }
	         }
	         
	      } catch (Exception e) {}
	   }
	   
	   static public void main(String args[]) throws Exception 
	   {
		   ImageRotation obj = new ImageRotation();
		   obj.imageRotation();
	   }
	
}
