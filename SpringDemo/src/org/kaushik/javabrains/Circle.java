package org.kaushik.javabrains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape{
	private Point center;
	
	//Resource is not specific to spring.
	@Resource
	public void setCenter(Point center)
	{
		this.center=center;
	}
	
	public Point getCenter()
	{
		return this.center;
	}
	
	public void draw()
	{
		System.out.println("Drawing circle");
		System.out.println("( "+getCenter().getX()+ "," + getCenter().getY()+ ")");
	}
	
	@PostConstruct
	public void initializeCircle()
	{
		System.out.println("Init of circle");
	}
	
	@PreDestroy
	public void destroyCircle()
	{
		System.out.println("Destroy of circle");
	}

}
