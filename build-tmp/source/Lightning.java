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

int dRandom = (int)(Math.random()*601);
int startX = 0;
int startY = dRandom;
int endX = 0;
int endY = dRandom;
int click = 0;

public void setup()
{
  size(600,600);
  strokeWeight(3);
  background(0,0,0);
  //noLoop();
  
}
public void draw()
{

	stroke((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
	while(endX<600)
	{
		endX=startX+(int)(Math.random()*10);
		endY=startY+(int)(Math.random()*20)-9;
		line(startX,startY,endX,endY);
	startX=endX;
	startY=endY;
	dRandom = dRandom+(int)(Math.random()*10)-5;
	if(dRandom<0||dRandom>600)
	{
		dRandom=(int)(Math.random()*600);
	}
}

fill(255,0,0);
ellipse(500,500,20,20);
noStroke();
fill(0,0,0);
rect(0,0,1000,40);
fill(255,0,0);
text("# of clicks:" + click,30,30);
}

public void mousePressed()
{
	//redraw();
	click=click+1;
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
