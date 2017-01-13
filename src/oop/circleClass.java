package oop;

public class circleClass {

	private double PI=3.1416;
	double radius;
	public void setRadius(double r){
		radius=r;
	}
public double getRadius(){
		return radius;
	}
public double getDiameter(){
	return radius*2;
}
public double getCircumference(){
	return 2*PI*radius;
}
public double  getArea(){
	return PI*(radius*radius);
}
}
