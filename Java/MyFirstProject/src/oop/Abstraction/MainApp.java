package oop.Abstraction;

public class MainApp {
	public static void main(String[] args) {
		Shape shape = new Shape() {
			@Override
			public void drawShape() {
				System.out.println("Ananomus implementation of abstract shape class");
			}
		};
		shape.drawShape();
		Shape rectangle = new Rectangle();
		rectangle.drawShape();
		
	}

}
