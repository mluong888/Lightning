import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int dRandom = (int)(Math.random()*301);
int startX = 0;
int startY = dRandom;
int endX = 0;
int endY = dRandom;

public void setup()
{
  size(300,300);
  strokeWeight(3);
  background(0,0,0);
  
}
public void draw()
{
	stroke((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
	while(endX<300)
	{
		endX=startX+(int)(Math.random()*10);
		endY=startY+(int)(Math.random()*20)-9;
		line(startX,startY,endX,endY);
	startX=endX;
	startY=endY;
	dRandom = dRandom+(int)(Math.random()*10)-2;
	if(dRandom<0||dRandom>300)
	{
		dRandom=150;
	}
}
}

public void mousePressed()
{
	startX=0;
	startY=dRandom;
	endX=0;
	endY=dRandom;

}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
