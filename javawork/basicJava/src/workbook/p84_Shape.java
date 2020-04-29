package workbook;

import java.awt.Point;

public abstract class p84_Shape {
	protected Point point;

	public p84_Shape() {
		super();
	}

	public p84_Shape(Point point) {
		super();
		this.point = point;
	}
	public abstract double getArea();
	public abstract double getCircumference();

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}
	
}
