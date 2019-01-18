package geometri;
import java.awt.*;

public class Line extends AbstractGeometricalForms{
    boolean isPositiveSlope;
	
	public Line(int x1, int y1, int x2, int y2, Color c) throws IllegalPositionException{  
	    super(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x1-x2), Math.abs(y1-y2), c);
	    this.isPositiveSlope = (y2-y1)/(x2-x1) > 0;
	}
	
	public Line(GeometricalForm f1, GeometricalForm f2, Color c){
		super(f1, Math.abs(f1.getX() - f2.getX()), Math.abs(f1.getY() - f2.getY()), c);
	}
	
	@Override
	public int getArea() {
		return 0;
	}
	
	@Override
	public void fill(Graphics g) {
		g.setColor(this.getColor());
		g.drawLine(
		        this.getX(), 
		        this.getY() + (this.isPositiveSlope ? 0 : this.getHeight()),
		        this.getX() + this.getWidth(), 
		        this.getY() + (this.isPositiveSlope ? this.getHeight() : 0)
		        );
	}
	
	@Override
	public int getPerimeter() {
		return (int) Math.sqrt(this.getWidth()^2 + this.getHeight()^2);
	}
	
	@Override
	public boolean equals(AbstractGeometricalForms geoForm) {
	    return geoForm instanceof Line && this.isPositiveSlope == ((Line) geoForm).isPositiveSlope
	            && super.equals(geoForm);
	}
	
	@Override
	public int hashCode() {
        return super.hashCode() + (isPositiveSlope ? 1231 : 1237);  
	}
	
	

}
