package geometri;

import java.awt.Color;
import java.awt.Graphics;
	
public abstract class AbstractGeometricalForms implements GeometricalForm{

	private Color color;
	private int startPointX;
	private int startPointY;
	private int width;
	private int height;
	
	public AbstractGeometricalForms(int x, int y, int width, int height, Color color)
	        throws IllegalPositionException {
	    CheckCoordinates(x, y);
        this.startPointX = x;
        this.startPointY = y;
        this.width = width;
        this.height = height;
        this.color = color;
	}
	
	public AbstractGeometricalForms(GeometricalForm f, int width, int height, Color color) {
	    this.startPointX = f.getX();
	    this.startPointY = f.getY();
	    this.width = width;
        this.height = height;
        this.color = color;  
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int compareTo(GeometricalForm f) {
	    if (this.getArea() - f.getArea() == 0) {
	        return this.getPerimeter() - f.getPerimeter();
	    }
	    else
	        return this.getArea() - f.getArea();
	}

	
	/**
	 * {@inheritDoc}
	 */
	public Color getColor() {
		return this.color;
	}

	
	/**
	 * {@inheritDoc}
	 */
	public int getWidth() {
		return this.width;
	}

	
	/**
	 * {@inheritDoc}
	 */
	public int getHeight() {
	    return this.height;
	}

	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getX() {
		return startPointX;
	}

	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getY() {
		return startPointY; 
	}

	
	/**
	 * {@inheritDoc}
	 */
	public void move(int dx, int dy) throws IllegalPositionException {
	    place(dx + this.startPointX, dy + this.startPointY);
	}

	
	/**
	 * {@inheritDoc}
	 */
	public void place(int x, int y) throws IllegalPositionException {
		CheckCoordinates(x, y);
		this.startPointX = x;
		this.startPointY = y;
	}
	
	public boolean equals(AbstractGeometricalForms geoForm) {
        return this.color == geoForm.getColor() && this.height == geoForm.getHeight()
                && this.width == geoForm.getWidth() && this.getArea() == geoForm.getArea();
	}
	
	@Override
	public int hashCode() {
	   return 17*color.hashCode() + 23*height + 29*width + 37*getArea(); 
	}
	
	public void CheckCoordinates(int x, int y) throws IllegalPositionException {
	    if(x < 0 || y < 0){
	        throw new IllegalPositionException();
	    }       
	}

}
