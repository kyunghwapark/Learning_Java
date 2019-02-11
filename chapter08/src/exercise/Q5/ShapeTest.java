package exercise.Q5;

import java.util.ArrayList;

class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Triangle");
	}
}

public class ShapeTest {
	
	public static void main(String[] args) {
		
		ArrayList<Shape> shapeList = new ArrayList<>();
		shapeList.add(new Circle());
		shapeList.add(new Triangle());
		shapeList.add(new Shape());

		for(Shape shape : shapeList) {
			shape.draw();
		}
	}
}
