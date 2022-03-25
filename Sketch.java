import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// Quad 1
    stroke(0);
    for (int lineX = 20; lineX <= 190; lineX += 20) {
      for (int lineY = 20; lineY <= 190; lineY += 20) {
        line(lineX, 0, lineX, 200); 
        line(0, lineY, 200, lineY); 
      }
      }
  
  // Quad 2
    for (int circleY = 30; circleY <= 175; circleY += 35) {
    for (int circleX = 230; circleX <= 375; circleX += 35) {
      fill(255, 0, 0);
      ellipse(circleX, circleY, 20, 20);
      }
      }
  
  // Quad 3
    for(int gradientY = 0; gradientY < 200; gradientY++){
    for(int gradientX = 200; gradientX < 400; gradientX++){
      stroke(gradientX, 0);
      stroke(gradientY, 255);
      point(gradientY, gradientX);
    }
  }
  // Quad 4
    //fill(50, 168, 82);
    //ellipse(300, 300, 30, 30);
    //draw petals
    //fill(232, 107, 53);
    //ellipse(300, 260, 20, 70);
    //rotate((float)1.5);
    //ellipse(320, 265, 20, 70);
    //ellipse(50, 150, 20, 70);
    //ellipse(150, 150, 20, 70);
    //ellipse(50, 50, 20, 70);
    //ellipse(150, 50, 20, 70);
    //ellipse(50, 150, 20, 70);
    //ellipse(150, 150, 20, 70);
    
    //for (int petalY = 300; petalY <= 400; petalY += 50) {
    //for (int petalX = 300; petalX <= 400; petalX += 50) {
      //fill(232, 107, 53);
      //rotate(1);
      //ellipse(petalX, petalY, 20, 60);
      //}
      //}
  }
  
  // define other methods down here.
}