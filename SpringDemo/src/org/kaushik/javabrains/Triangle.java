package org.kaushik.javabrains;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle
{
    private List<Point> points;
	private Point pointA;
    private Point pointB;
    private Point pointC;
    private ApplicationContext context;
    
    public List<Point> getPoints()
    {
    	return this.points;
    }
    
    public void setPoints(List<Point> points)
    {
    	this.points=points;
    }
    
    public Point getPointA()
    {
    	return this.pointA;
    }
    
    public void setPointA(Point pointA)
    {
    	this.pointA=pointA;
    }
    
    public Point getPointB()
    {
    	return this.pointB;
    }
    
    public void setPointB(Point pointB)
    {
    	this.pointB=pointB;
    }
    
    public Point getPointC()
    {
    	return this.pointC;
    }
    
    public void setPointC(Point pointC)
    {
    	this.pointC=pointC;
    }
	public void draw()
	{
		System.out.println("PointA : ( "+getPointA().getX() + " ," + getPointA().getY()+ ")");
		System.out.println("PointB : ( "+getPointB().getX() + " ," + getPointB().getY()+ ")");
		System.out.println("PointC : ( "+getPointC().getX() + " ," + getPointC().getY()+ ")");
		
		
	}

//	@Override
//	public void afterPropertiesSet() throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("InitializingBean init method called for triangle");
//		
//	}
//
//	@Override
//	public void destroy() throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("DisposableBean destroy method called for triangle");
//		
//	}
	
	public void MyInit()
	{
		System.out.println("MyInit() method called for triangle");
	}
	
	public void MyDestroy()
	{
		System.out.println("MyDestroy() method called for triangle");
	}
	
	



}


