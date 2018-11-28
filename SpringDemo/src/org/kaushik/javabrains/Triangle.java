package org.kaushik.javabrains;

public class Triangle 
{
    Point pointA;
    Point pointB;
    Point pointC;
    public void setPointA(Point pointA)
    {
    	this.pointA=pointA;
    }
    public void setPointB(Point pointB)
    {
    	this.pointB=pointB;
    }
    public void setPointC(Point pointC)
    {
    	this.pointC=pointC;
    }
    public Point getPointA()
    {
    	return this.pointA;
    }
    public Point getPointB()
    {
    	return this.pointB;
    }
    public Point getPointC()
    {
    	return this.pointC;
    }
	public void draw()
	{
		System.out.println("Point A: ( "+getPointA().getX() + " ," + getPointA().getY()+ ")");
		System.out.println("Point B: ( "+getPointB().getX() + " ," + getPointB().getY()+ ")");
		System.out.println("Point C: ( "+getPointC().getX() + " ," + getPointC().getY()+ ")");
		
	}

}
