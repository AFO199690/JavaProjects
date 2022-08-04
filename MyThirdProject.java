
class Shape {
  //create method{
	public void sha() {
		//display given message
	System.out.println("This is shape");
}
	//creating Rectangle class and inherit shape class
    class Rectangle extends Shape{
    public void print_rect() {
    	System.out.println("This is rectangular shape");
    }
    }
    //Circle class is subclass of shape class
    class Circle extends Shape{
    	 public void print_circle() {
    	    	System.out.println("This is circular shape");
    }
    }
    //Square class is subclass of Rectangle class
    class Square extends Rectangle{
    	public void print_square() {
    		System.out.println("Square is a rectangle");

    	}
    }
 }

import Shape.Square;

public class Main {

	public static void main(String[] args) {
		//create object of square class
  Square sqt =new Square()
  //call method of shape class using square class object
  sqt.sha();
 //call method of Rectangle class using square class object
  sqt.print_rect();
	
}

}