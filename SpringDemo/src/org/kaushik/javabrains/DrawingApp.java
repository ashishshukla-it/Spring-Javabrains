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
org.springframework.context.event.ContextRefreshedEvent[source=org.springframework.context.support.ClassPathXmlApplicationContext@4534b60d: startup date [Sat Dec 15 10:17:16 IST 2018]; root of context hierarchy]
Drawing cirlce
Circle: point is (30,31)
org.springframework.context.event.ContextClosedEvent[source=org.springframework.context.support.ClassPathXmlApplicationContext@4534b60d: startup date [Sat Dec 15 10:17:16 IST 2018]; root of context hierarchy]
Destroy of circle
*/

/* ApplicationContext provides another feature called event handling. It has 3 core elements-
 * Event publisher, event listener, event
 * onApplicationEvent() of MyEventListener will list out all the events related to framework.
 */



 
