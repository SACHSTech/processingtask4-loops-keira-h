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
    strokeWeight(2);
    
    for (int lineX = 0; lineX <= 200; lineX += 20) {
      for (int lineY = 0; lineY <= 200; lineY += 20) {
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
    for(int gradientY = 0; gradientY < 400; gradientY++){
    for(int gradientX = 0; gradientX < 200; gradientX++){
      stroke(gradientX, 0);
      stroke(gradientY, 255);
      point(gradientX, gradientY);
    }
  }
  }
  
  // define other methods down here.
}