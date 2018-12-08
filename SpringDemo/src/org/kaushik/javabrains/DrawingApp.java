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
		context.registerShutdownHook();
		Shape shape=(Shape) context.getBean("circle");
		shape.draw();
	}
}

/* 
Output:
Init of circle
Drawing circle
( 30,31)
Dec 08, 2018 1:13:57 PM org.springframework.context.support.ClassPathXmlApplicationContext doClose
INFO: Closing org.springframework.context.support.ClassPathXmlApplicationContext@4534b60d: startup date [Sat Dec 08 13:13:57 IST 2018]; root of context hierarchy
Destroy of circle
*/

/* JSR- Java Specification Request
 * JSR 250, as a Java Specification Request, has the objective to define a set of annotations that address common semantic concepts and therefore can be used by many Java EE and Java SE components.
 * This is to avoid redundant annotations across those components.
 * registerShutdownHook() is required for execution of postDestroy. 
 */



 
