import java.awt.*;
//  Class author:  Parker Lasko
//  Date created:  12/4/2024
//  General description: is blueprint for ball object providing its possible actions and associated variables 
public class Ball{
	//your code here!
	
	//don't forget you need instance variables:
	private int XPos;
	private int YPos;
	private int size;
	private int XVelocity;
	private int YVelocity;


	

	
	//constructor(s):
	public Ball(int XPos, int YPos, int size) {
		this.XPos = XPos;
		this.YPos = YPos;
		this.size = size;
		this.XVelocity = 1;
		this.YVelocity = 1;
	
	
	}
	//getters for ball


public int getXpos()
{
	return XPos;
}
public int getYpos() 
{
	return YPos;
}
public int getSize()
{
	return size;
}

	//setters
	public void setX(int XPos)
	 {
		this.XPos = XPos;
	}
	public void setY(int YPos)
	 {
		this.YPos = YPos;
	}
	public void setsize(int size)
	{
	   this.size = size;
   }
   public void setXVelocity(int XVelocity)
   {
	  this.XVelocity = XVelocity;
  }
  public void setYVelocity(int YVelocity)
  {
	 this.YVelocity = YVelocity;
 }



	//methods:

	//  Pre-condition: must provide locatiion of ball and its size
	//  possible limitations on input: none
//  Post-condition: will draw a white oval at the location of the ball 


public void draw(Graphics g)
{
 g.setColor(Color.white); // call first to set the desired color
	   g.fillOval(XPos, YPos, size, size); // draws an oval (ball)

}
//  Pre-condition: must provide XVelocity, YVelocity, XPos, and YPos
	//  possible limitations on input: none
//  Post-condition: Moves the ball 
public void move()
{
	XPos += XVelocity;
	YPos += YVelocity;
}
//  Pre-condition: must provide XVelocity 
	//  possible limitations on input: none
//  Post-condition: will reverse the velocity of the ball sending it in the oppiste x direction
public void reverseX()
{
	XVelocity = XVelocity * -1;
}
//  Pre-condition: must provide YVelocity 
	//  possible limitations on input: none
//  Post-condition: will reverse the velocity of the ball sending it in the oppiste y direction
public void reverseY()
{
	YVelocity = YVelocity * -1;
}
}