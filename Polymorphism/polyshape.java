import java.util.Scanner;
abstract class Shape{
	protected String colour;		    
	public Shape()
	{
		colour="red";
    	}
	public Shape(String s)
	{
		colour=s;
	}    
	public String getColour()
	{
		return colour;
	}	    
   	public void setColour(String s)
	{
		colour=s;
	}
	abstract float getArea();
	abstract float getPerimeter();
}

class Circle extends Shape
{
	protected float radius;
	
	public Circle()
	{
		radius = 1;
	}
	public Circle(float radius)
	{
		this.radius = radius;
	}
	public Circle(float radius, String color)
	{
		super(color);
		this.radius = radius;
		
	}
	public float getRadius()
	{
		return radius;
	}
	public void setRadius(float radius)
	{
		this.radius = radius;
	}
	public float getArea()	
	{
		return 3.14*radius*radius;
	}
	public float getPerimeter()
	{
		return 2*3.14*radius;
	}
}
class Rectangle extends Shape
{
	protected float width,length;
	public Rectangle()
	{
		width = 1.0;
		length = 1.0;
	}
	public Rectangle(float width,float length)
	{
		this.width = width;
		this.length = length;
	}
	public Rectangle(float width,float length,String color)
	{
		super(color);
		this.width = width;
		this.length = length;
	}
	public float getWidth()
	{
		return width;
	}
	public float getLength()
	{
		return length;
	}
	public void setWidth(float width)
	{
		this.width = width;
	}
	public void setLength(float length)
	{
		this.length = length;
	}
	public float getArea()
	{
		return length*width;
	}
	public float getPerimeter()
	{
		return 2*(length+width);
	}
}
class Square extends Rectangle
{
	
	public Square()
	{
		width=1.0;
		length=1.0;
	}
	public Square(float side)
	{
		width = side;
		length = side;
	}
	public Square(float side,String color)
	{
		super(side,side,color);
		
	}
	public float getSide()
	{
		return width;
	}
	public void setSide(float side)
	{
		width = side;
		length = side;
	}
	public float getArea()
	{
		return super.getArea();
	}
	public float getPerimeter()
	{
		return super.getPerimeter();
	}
}
class polyshape
{
	public static void main(String args[])
	{
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle(20,30);
		Rectangle r3=new Rectangle(20,35,"blue");
		System.out.println("The area of rectangle 1 is: "+r1.getArea()+"\nPerimeter: "+r1.getPerimeter());
		System.out.println("The area of rectangle 2 is: "+r2.getArea()+"\nPerimeter: "+r2.getPerimeter());
		System.out.println("The area of rectangle 3 is: "+r3.getArea()+"\nPerimeter: "+r3.getPerimeter()+"\nColor: "+r3.getColour());


		Square s1=new Square();
		Square s2=new Square(30);
		Square s3=new Square(45,"pink");
		System.out.println("The area of Square 1 is: "+s1.getArea()+"\nPerimeter: "+s1.getPerimeter());
		System.out.println("The area of Square 2 is: "+s2.getArea()+"\nPerimeter: "+s2.getPerimeter());
		System.out.println("The area of Square 3 is: "+s3.getArea()+"\nPerimeter: "+s3.getPerimeter());
	
	
		Circle c1=new Circle();
		Circle c2=new Circle(30);
		Circle c3=new Circle(45,"pink");
		System.out.println("The area of Square 1 is: "+c1.getArea()+"\nPerimeter: "+c1.getPerimeter());
		System.out.println("The area of Square 2 is: "+c2.getArea()+"\nPerimeter: "+c2.getPerimeter());
		System.out.println("The area of Square 3 is: "+c3.getArea()+"\nPerimeter: "+c3.getPerimeter());		
	}
}
	
