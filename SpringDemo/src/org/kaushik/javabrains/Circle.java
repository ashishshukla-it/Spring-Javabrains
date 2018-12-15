package org.kaushik.javabrains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware 
// When spring sees any bean has implemented ApplicationEventPublisherAware, then it provides publisher object to such beans.
// Then we can assign that object to a local variable and can use to publish as many no. of events we want.
{
	private Point center;
	private ApplicationEventPublisher publisher;
	/* This publisher now has methods to implement Event publisher.
	 * This publisher is actually ApplicationContext.
	 * publisher.publishEvent, we are calling method of applicationContext i.e. this can also be done by applicationContext.publishEvent.
	 * But here we are doing like this because we are implementing 'coding to interface'. 
	*/
	
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
		// System.out.println("Drawing circle");
		System.out.println(getMessageSource().getMessage("drawing.circle",null,"Default drawing message",null));
		// System.out.println("( "+getCenter().getX()+ "," + getCenter().getY()+ ")");
		System.out.println(getMessageSource().getMessage("drawing.point",new Object[] {getCenter().getX(), getCenter().getY()},"Default points",null));
		// System.out.println(getMessageSource().getMessage("greeting",null,"Deafault greeting",null));
		
		drawEvent drawEvent=new drawEvent(this);
		publisher.publishEvent(drawEvent);
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

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		// TODO Auto-generated method stub
		this.publisher=publisher;
		
	}

}
