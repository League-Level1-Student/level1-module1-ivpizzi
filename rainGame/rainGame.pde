void setup()
{
  
  size(1000, 750);
  background(100, 150, 175);
  
}

float raindropX = random(5, 745);
float raindropY = 10;

int score = 0;

void draw()
{
  
  background(100, 150, 175);
  fill(100, 100, 255);
  stroke(100, 100, 255);
  
  ellipse(raindropX, raindropY, 10, 10);
  
   if(raindropY < 1005)
   {
     
     raindropY += 8;
     
   }
   else
   {
     
     checkCatch(raindropX);
     
     raindropX = random(5, 1000);
     raindropY = 10;
     
   }
   
   fill(100);
   stroke(100);
   rect(mouseX, 700, 75, 100);
  
}

void checkCatch(float x)
{
     if (x > mouseX && x < mouseX + 75)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score);
   }