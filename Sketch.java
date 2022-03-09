import processing.core.PApplet;

public class Sketch extends PApplet {
	// This Code will randomize the location of a flower and change the colours depending on the location
  //aswell as showing the time in the top left at any given time
	//@Nicholas Koukoulidis
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  //setup background 
  public void setup() {
    background(66, 245, 239);
  }

   //setup draw
    public void draw() {


    //define time

    int hour = hour();
    //int actualHour = (int)(hour + 7);
    int minute = minute();
    int second = second();
    //define variables
    
    float randomFlowerX = random(0, 400);
    float randomFlowerY = random(0, 400);
    float petalDiameter = random(20, 100);
    float petalDistance = petalDiameter / 2;
	  
	  // sample code, delete this stuff
    stroke(128);
    line(150, 25, 270, 350);  

    stroke(255);
    line(50, 125, 70, 50);  

    // Change Background if x is less than 200 and y is greater  than 200
    if(randomFlowerX <200 && randomFlowerY > 200);{background(0,200,0);
    // top left circle
    fill(255, 0, 0);
    ellipse(randomFlowerX - petalDistance, randomFlowerY - petalDistance, petalDiameter, petalDiameter);
    // top right circle
    fill(255, 0, 0);
    ellipse(randomFlowerX + petalDistance, randomFlowerY - petalDistance, petalDiameter, petalDiameter);
    // bottom left circle
    fill(255, 0, 0);
    ellipse(randomFlowerX - petalDistance, randomFlowerY + petalDistance, petalDiameter, petalDiameter);

    // bottom right circle
    fill(255, 0, 0);
    ellipse(randomFlowerX + petalDistance, randomFlowerY + petalDistance, petalDiameter, petalDiameter);
    
    // center of flower
    fill(10, 0, 194);
    ellipse(randomFlowerX, randomFlowerY, petalDiameter, petalDistance * 2);

    }
    //Change Background Colour

    if(!(randomFlowerX < 200) || !(randomFlowerY > 200)) {
    background(51, 153, 255);
    
    // upper left petal
    fill(230, 0, 255);
    ellipse(randomFlowerX - petalDistance, randomFlowerY - petalDistance, petalDiameter, petalDiameter);

    // upper right petal
    fill(230, 0, 255);
    ellipse(randomFlowerX + petalDistance, randomFlowerY - petalDistance, petalDiameter, petalDiameter);

    // bottom left petal
    fill(230, 0, 255);
    ellipse(randomFlowerX - petalDistance, randomFlowerY + petalDistance, petalDiameter, petalDiameter);

    // bottom right petal
    fill(230, 0, 255);
    ellipse(randomFlowerX + petalDistance, randomFlowerY + petalDistance, petalDiameter, petalDiameter);
    
    // center of flower
    fill(168, 111, 54);
    ellipse(randomFlowerX, randomFlowerY, petalDiameter, petalDistance * 2);

    }


    // change background 

    if(!(randomFlowerX < 200) && !(randomFlowerY < 200)) {
    background(133, 242, 139);
  
    // upper left petal
    fill(110, 1, 1);
    ellipse(randomFlowerX - petalDistance, randomFlowerY - petalDistance, petalDiameter, petalDiameter);

    // upper right petal
    fill(110, 1, 1);
    ellipse(randomFlowerX + petalDistance, randomFlowerY - petalDistance, petalDiameter, petalDiameter);

    // bottom left petal
    fill(110, 1, 1);
    ellipse(randomFlowerX - petalDistance, randomFlowerY + petalDistance, petalDiameter, petalDiameter);

    // bottom right petal
    fill(110, 1, 1);
    ellipse(randomFlowerX + petalDistance, randomFlowerY + petalDistance, petalDiameter, petalDiameter);
    
    // center of flower
    fill(242, 133, 133);
    ellipse(randomFlowerX, randomFlowerY, petalDiameter, petalDistance * 2);
     }

    if(!(randomFlowerX > 200) && !(randomFlowerY < 200)) {
    background(133, 242, 139);
    
    // upper left petal
    fill(110, 1, 1);
    ellipse(randomFlowerX - petalDistance, randomFlowerY - petalDistance, petalDiameter, petalDiameter);

    // upper right petal
    fill(110, 1, 1);
    ellipse(randomFlowerX + petalDistance, randomFlowerY - petalDistance, petalDiameter, petalDiameter);

    // bottom left petal
    fill(110, 1, 1);
    ellipse(randomFlowerX - petalDistance, randomFlowerY + petalDistance, petalDiameter, petalDiameter);

    // bottom right petal
    fill(110, 1, 1);
    ellipse(randomFlowerX + petalDistance, randomFlowerY + petalDistance, petalDiameter, petalDiameter);
    
    // center of flower
    fill(242, 133, 133);
    ellipse(randomFlowerX, randomFlowerY, petalDiameter, petalDistance * 2);
    
       
    }

    if(!(randomFlowerX < 200) && !(randomFlowerY < 200)) {
    background(252, 223, 3);
    
    // upper left petal
    fill(0, 255, 255);
    ellipse(randomFlowerX - petalDistance, randomFlowerY - petalDistance, petalDiameter, petalDiameter);

    // upper right petal
    fill(0, 255, 255);
    ellipse(randomFlowerX + petalDistance, randomFlowerY - petalDistance, petalDiameter, petalDiameter);

    // bottom left petal
    fill(0, 255, 255);
    ellipse(randomFlowerX - petalDistance, randomFlowerY + petalDistance, petalDiameter, petalDiameter);

    // bottom right petal
    fill(0, 255, 255);
    ellipse(randomFlowerX + petalDistance, randomFlowerY + petalDistance, petalDiameter, petalDiameter);
    
    // center of flower
    fill(191, 245, 245);
    ellipse(randomFlowerX, randomFlowerY, petalDiameter, petalDistance * 2);
       }

    size(400, 400);


    //No loop
    noLoop();
    
    //Tell the time
    text ("the time is : " + hour + ":" + minute + ":" + second + " GST", 1, 10);
    
  }
  
  // define other methods down here.
}