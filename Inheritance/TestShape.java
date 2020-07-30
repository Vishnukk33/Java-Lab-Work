/*EXERCISE : 3B
1. The hierarchy Shape --> Rectangle --> Square is a Multi-level inheritance type.
2. The type of above entire class hierarchy is the Hierarchical inheritance.
3. Note the constructor overloading at all the levels.
4. # denotes protected variable. The protected variables can be accessed by its
subclasses and classes in the same package.

 Write a test driver called TestShape to test all the public methods. Display the
area and perimeter of all the shapes (Circle, Rectangle and Square).

*/


class Shape{
    protected String colour;
    
    public Shape(){
	colour="red";
    }
    public Shape(String s){
	colour=s;
    }
    
    public String getColour(){
	return colour;
    }
    
    public void setColour(String s){
	colour=s;
    }
}

class Circle extends Shape{
    protected float radius;
    public Circle(){
	radius=(float)1.0;
    }
    
    public Circle(float r){
	radius=r;	
    }
    
    public Circle(float r, String c){
	super(c);
	radius=r;
    }
    
    public float getRadius(){
	return radius;
    }
    
    public void setRadius(float r){
	radius =r;
    }
    
    public float getArea(){
	return (float)3.14*radius*radius;
    }
    
    public float getPerimeter(){
	return 2*(float)3.14*radius;
    }
    
    
}

class Rectangle extends Shape{
    protected float width;
    protected float length;
    
    public Rectangle(){
	width=(float)1.0;
	length=(float)1.0;
    }
    public Rectangle(float w, float l){
	width=w;
	length=l;
    }
    public Rectangle(float w, float l, String s){
	super(s);
	width=w;
	length=l;
    }
    
    public float getWidth(){
	return width;
    }
    
    public float getLength(){
	return length;
    }
    
    public void setWidth(float w){
	width=w;
    }
    
    public void setLength(float l){
	length=l;
    }
    
    public float getArea(){
	return length*width;
    }
    
    public float getPerimeter(){
	return 2*(length+width);
    }
    
    
}


class Square extends Rectangle{
    
    public Square(){
	length=(float)1.0;
	width=(float)1.0;
    }
    public Square(int side){
	super(side,side);
    }
    
    public Square(int side, String c){
	super(side,side,c);
    }
     
    public float getSide(){
	return length;
    }
    
    public void setSide(float s){
	width=s;
	length=s;
    }
    
}

public class TestShape{
    public static void main(String args[]){
	Rectangle r1=new Rectangle();
	Rectangle r2=new Rectangle(20,30);
	Rectangle r3=new Rectangle(20,35,"blue");
	System.out.println("The area of rectangle 1 is: "+r1.getArea()+"\nPerimeter: "+r1.getPerimeter());
	System.out.println("The area of rectangle 2 is: "+r2.getArea()+"\nPerimeter: "+r2.getPerimeter());
	System.out.println("The area of rectangle 3 is: "+r3.getArea()+"\nPerimeter: "+r3.getPerimeter());


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
/*OUTPUT:
cs1200@u13:~/Desktop/Java/Inh2$ javac TestShape.java 
cs1200@u13:~/Desktop/Java/Inh2$ java TestShape 
The area of rectangle 1 is: 1.0
Perimeter: 4.0
The area of rectangle 2 is: 600.0
Perimeter: 100.0
The area of rectangle 3 is: 700.0
Perimeter: 110.0
The area of Square 1 is: 1.0
Perimeter: 4.0
The area of Square 2 is: 900.0
Perimeter: 120.0
The area of Square 3 is: 2025.0
Perimeter: 180.0
The area of Square 1 is: 3.14
Perimeter: 6.28
The area of Square 2 is: 2826.0002
Perimeter: 188.40001
The area of Square 3 is: 6358.5
Perimeter: 282.6
*/
