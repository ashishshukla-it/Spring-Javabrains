package org.kaushik.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class DrawingApp {

	public static void main(String[] args) 
	{
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml"); 
	    context.registerShutdownHook();
		Shape shape=(Shape) context.getBean("circle");
		shape.draw();
	}

}

/* 
We want that there should be a validation while bean is initialized and if some thing is wrong then we should get error there only.
This is done by required annotation.
Here we have put required in setCenter() of circle so if there is no center at the time of circle bean initialization, then error will occur there itself.
Output:
Error during bean initialization (org.springframework.beans.factory.BeanCreationException)

*/


/* If we just delete property of circle in xml, then null pointer exception will occur after bean is called.
 * Output:
 * Drawing circle
java.lang.NullPointerException
 */
 
