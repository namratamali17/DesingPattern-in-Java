package designpattern;
//make interface and abstract methad
interface Shape {
	void drow();
}

class Circle implements Shape{

	@Override
	public void drow() {
		System.out.println("Drowing  Circle ");
		
	}
	
}
class Rectangle implements Shape{

	@Override
	public void drow() {
		System.out.println("Drowing  Rectangle ");
		
	}
	
}
class Squre implements Shape{

	@Override
	public void drow() {
		System.out.println("Drowing  Squre ");
		
	}
	
}
class ShapeFactory{
	public  Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("Circle"))
			return new Circle();
		else if(shapeType.equalsIgnoreCase("Rectangle"))
			return new Rectangle();
		else if (shapeType.equalsIgnoreCase("Squre"))
			return new Squre();
		else 
			return null;	
		
	}
}

public class FactoryDesignPattern {
	public static void main(String[] args) {
		ShapeFactory f=new ShapeFactory();
		Shape shape;
		shape=f.getShape("Circle");
		shape.drow();
	}
	
	
	

}
