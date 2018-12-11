package org.kaushik.javabrains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class Circle implements Shape{
	private Point center;
	
	// We are declaring MessageSource member variable here so that we can inject messageSource bean here.
	@Autowired
	private MessageSource messageSource;
	
	public void setMessageSource(MessageSource messageSource)
	{
		this.messageSource=messageSource;
	}
	
	//Resource is not specific to spring.
	@Resource
	public void setCenter(Point center)
	{
		this.center=center;
	}
	
	public MessageSource getMessageSource()
	{
		return this.messageSource;
	}
	
	public Point getCenter()
	{
		return this.center;
	}
	
	public void draw()
	{
		System.out.println("Drawing circle");
		System.out.println("( "+getCenter().getX()+ "," + getCenter().getY()+ ")");
		System.out.println(getMessageSource().getMessage("greeting",null,"Deafault greeting",null));
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
