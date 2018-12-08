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
Output:
Drawing circle
( 30,31)
*/

/* JSR- Java Specification Request
 * JSR 250, as a Java Specification Request, has the objective to define a set of annotations that address common semantic concepts and therefore can be used by many Java EE and Java SE components.
 * This is to avoid redundant annotations across those components.
 */



 
