package geometri;
import java.awt.*;

public class Point extends Rectangle {
	
	 public Point(int x, int y, Color c) throws IllegalPositionException{
	     super(x, y, 0, 0, c);
	 }
	 
	 public Point(GeometricalForm f, Color c){
	     super(f, 0, 0, c);
	 }
	 
	 @Override
	 public void fill(Graphics g) {
	     g.setColor(this.getColor());
	     g.fillOval(this.getX(), this.getY(), 20, 20);
	 } 
}
