int dRandom = (int)(Math.random()*301);
int startX = 0;
int startY = dRandom;
int endX = 0;
int endY = dRandom;

void setup()
{
  size(300,300);
  strokeWeight(3);
  background(0,0,0);
  
}
void draw()
{
	stroke((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
	while(endX<300)
	{
		endX=startX+(int)(Math.random()*10);
		endY=startY+(int)(Math.random()*20)-9;
		line(startX,startY,endX,endY);
	startX=endX;
	startY=endY;
	dRandom = dRandom+(int)(Math.random()*10)-5;
	if(dRandom<0||dRandom>300)
	{
		dRandom=150;
	}
}
}

void mousePressed()
{
	startX=0;
	startY=dRandom;
	endX=0;
	endY=dRandom;

}

