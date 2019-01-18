package geometri;
import java.awt.*;

public class Oval extends AbstractGeometricalForms{

	public Oval(int x, int y, int width, int height, Color c) throws IllegalPositionException{
	    super(x, y, width, height, c);
	}
	
	public Oval(GeometricalForm f, int width, int height, Color c) {
	    super(f, width, height, c);
	}

	@Override
	public int getArea() {
	    double radiusA = (double) this.getHeight()/2;
	    double radiusB = (double) this.getWidth()/2;
	    double Area = radiusA*radiusB*Math.PI;
	    return (int) Area;
	}


	@Override
	public int getPerimeter() {
	    double radiusA = (double) this.getHeight()/2;
        double radiusB = (double) this.getWidth()/2;
        double perimeter = 2*Math.PI*Math.sqrt((radiusA*radiusB)/2);
        return (int) perimeter;
	}

    @Override
    public void fill(Graphics g) {
        g.setColor(this.getColor());
        g.fillOval(getX(), getY(), getWidth(), getHeight());
    }
	
}
