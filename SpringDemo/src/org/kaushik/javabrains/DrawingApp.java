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
( 0,0)
*/

/* Now if we reenter beans of pointB and pointC and then again rerun the code, then error will get generated.
 * This is because autowire is unable to resovle, which bean to be used.
 * So we are changing the name of bean from "pointA" to "center". 
 * Now since in circle class, name of object is center, autowire is able to guess that this must be the bean that is required.
 */



 
