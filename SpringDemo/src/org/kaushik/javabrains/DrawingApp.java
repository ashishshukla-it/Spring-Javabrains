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
Init of circle
Drawing circle
( 30,31)
hello
Destroy of circle
*/

/* Things done in previous code can be done in other ways as well.
 * We are trying to put the message in the bean (circle bean in this case).
 * (This can be done by previous method as well).
 * 
 * 
 */



 
