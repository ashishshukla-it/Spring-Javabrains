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
Drawing cirlce
Circle: point is (30,31)
Destroy of circle
*/

/* Here we are seeing how to pass parameter in getMessage()
 */



 
