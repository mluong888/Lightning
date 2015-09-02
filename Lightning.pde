int dRandom = (int)(Math.random()*601);
int startX = 0;
int startY = dRandom;
int endX = 0;
int endY = dRandom;
int click = 0;

void setup()
{
  size(600,600);
  strokeWeight(3);
  background(0,0,0);
  //noLoop();
  
}
void draw()
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

void mousePressed()
{
	//redraw();
	click=click+1;
	startX=0;
	startY=dRandom;
	endX=0;
	endY=dRandom;
	

}

