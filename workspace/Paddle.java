import java.awt.*;
//  Class author:  Parker Lasko
//  Date created:  12/4/2024
//  General description: Creates a blue print for the paddle providing its possible actions and associated variables 
public class Paddle {

	//your code here!
	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int width;
    private int height;
	private int Velocity;
	
	//constructor(s):
	public Paddle (int x, int y, int width, int height)
{
	this.x = x;
	this.y = y;
	this.width = width;
	this.height = height;
	this.Velocity = 0;
	
}
	//setters for paddle
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setwidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	public void setVelocity(int Velocity) {
		this.Velocity = Velocity;
	}

	//getters for paddle
	public int getX()
	{
return x;
	}
	public int getY()
	{
return y;
	}
	public int getWidth()
	{
return width;
	}
	public int getHeight()
	{
return height;
	}
	public int getVelocity()
	{
return Velocity;
	}

	//methods:
//  Pre-condition: must provide locatiion of paddle and its size (width and height)
//  possible limitations on input: none
//  Post-condition: will draw a white rectangle at the location of the paddle 
	public void draw (Graphics g)
	{
		 g.setColor(Color.white); // call first to set the desired color
               g.fillRect(x ,y ,width ,height); // draws a rectangle (paddle)
	}
	//  Pre-condition: must provide Velocity and x 
	//  possible limitations on input: none
//  Post-condition: Moves the rectangle and prevnts it from going outside of the set bounds of the screen (x = 0,600 ) 
	public void move ()
	{
		if (Velocity > 0)
		{
			Velocity--;
		}
		if (Velocity < 0)
		{
			Velocity++;
		}
		if(x < 0)
		{
			x = 0;
		
		}
		else if(x > 600)
		{
			x = 600;
			
		}
		else{
			x += Velocity;
		}
		
	}
		//  Pre-condition: must provide Velocity and uses this.Velocity
	//  possible limitations on input: none
//  Post-condition: adds velocity to the paddle based on the current velocity and the velocity that sahould be added based on the inputted int Velocity when the method is called
	public void addVelocity (int Velocity)
	{
		this.Velocity += Velocity;
	}
}