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
    for (int intLineX = 20; intLineX <= 190; intLineX += 20) {
      for (int intLineY = 20; intLineY <= 190; intLineY += 20) {
        line(intLineX, 0, intLineX, 200); 
        line(0, intLineY, 200, intLineY); 
      }
      }
  
  // Quad 2
    for (int intCircleY = 30; intCircleY <= 175; intCircleY += 35) {
    for (int intCircleX = 230; intCircleX <= 375; intCircleX += 35) {
      fill(255, 0, 0);
      ellipse(intCircleX, intCircleY, 20, 20);
      }
      }
  
  // Quad 3
    for(int intGradientY = 0; intGradientY < 200; intGradientY++){
    for(int intGradientX = 200; intGradientX < 400; intGradientX++){
      stroke(intGradientX, 0);
      stroke(intGradientY, 255);
      point(intGradientY, intGradientX);
    }
  }
  // Quad 4
    fill(232, 107, 53);
    stroke(0);
    translate(300, 300);
    for (int intPetal = 0; intPetal <= 8; intPetal ++) {
      rotate(PI / 4);
      ellipse(40, 0, 80, 23);
      }

      // Middle
      stroke(0);
      fill(47, 128, 69);
      ellipse(0, 0, 44, 44);
  }
  
  // define other methods down here.
}