package geometri;
import java.awt.*;

public class Rectangle extends AbstractGeometricalForms{
	
	public Rectangle(int x, int y, int width, int height, Color c) throws IllegalPositionException{
		super(x, y, width, height, c);
	}
	public Rectangle(GeometricalForm f, int width, int height, Color c){
		super(f, width, height, c);
	}
	
	
	@Override
	public int getArea() {
		return getWidth()*getHeight();
	}
	
	
	@Override
	public void fill(Graphics g) {
	    g.setColor(this.getColor());
	    g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
	}
	
	
	@Override
	public int getPerimeter() {
		return 2*getHeight() + 2*getWidth();
	}

}
