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
		System.out.println(context.getMessage("greeting",null,"Deafault greeting",null));
		// (name of the property, parameters for the message, Default message if property of given name is not found, locale for which we need the message)
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

/* Sometimes we want several messages to be displayed in different parts of our application.
 * It won't look nice if all messages are written in middle of our code.
 * So we create a separate file for it.
 */



 
