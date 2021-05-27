package lab11;
import java.io.*;
import java.util.*;

public class Runner
{
	public static void main(String args[])
	{
		
		//create an object for circle class 
		Circle c = new Circle(4);
//create an object for rectangle class 
		Rectangle r = new Rectangle(4, 3);
		//call the method ShowArea using Circle object
		ShowArea(c);
		//call the method ShowArea using rectangle object
		ShowArea(r);
	}
	public static void ShowArea(Shape s)
	{
		double area = s.area();
		System.out.println("The area of the shape is " + area);
	}
}