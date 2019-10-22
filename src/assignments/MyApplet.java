package assignments;

import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

public class MyApplet extends Applet
{
      public void paint(Graphics g)
      {
    	  Scanner sc = new Scanner(System.in);
    	  String ch = sc.nextLine();
    	  System.out.println(ch);
    	  switch(ch)
    	  {
    	  case "line": 
    		  g.drawLine(10,10,50,50);
    		  break;
    	  case "rectangle":
    		  g.drawRect(10,60,40,30);
              g.setColor(Color.blue);
              g.fillRect(60,10,30,80);
              g.setColor(Color.green);
    		 break;
    	  case "roundrectangle":
    		  g.drawRoundRect(10,100,80,50,10,10);
              g.setColor(Color.yellow);
              g.fillRoundRect(20,110,60,30,5,5);
              g.setColor(Color.red);
              break;
    	  case "lines":
    		  g.drawLine(100,10,230,140);
              g.drawLine(100,140,230,10);
              break;
    	  case "string":
    		  g.drawString("Line Rectangles Demo",65,180);
    		  break;
    	  case "oval":
    		  g.drawOval(230,10,200,150);
              g.setColor(Color.blue);
              g.fillOval(245,25,100,100);
    	  }
           
           
           
      }
}