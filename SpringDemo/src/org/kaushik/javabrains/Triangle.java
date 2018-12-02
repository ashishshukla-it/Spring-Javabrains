package org.kaushik.javabrains;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware
{
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private ApplicationContext context;
    
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

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		// TODO Auto-generated method stub
		this.context=context;
		
	}

	@Override
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		System.out.println("Bean name is :" + beanName);
		
	}

}

/* Sometimes we need Spring Framework objects in our beans to perform some operations, for example reading ServletConfig and ServletContext parameters or to know the bean definitions loaded by the ApplicationContext. That�s why spring framework provides a bunch of *Aware interfaces that we can implement in our bean classes.
 * All of the *Aware interfaces are sub-interfaces of Aware and declare a single setter method to be implemented by the bean. Then spring context uses setter-based dependency injection to inject the corresponding objects in the bean and make it available for our use.
 * */
