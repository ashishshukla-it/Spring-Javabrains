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

/* Again change name of bean from "center" to "pointA". 
 * Autowire will first check beans on the basis of type but there are multiple beans with same type.
 * Then it will check with bean name and now this will also not match.
 * So now we are using Qualifier annotation. Now matching will be done on the basis of Qualifier name (circleRelated is qualifier name in this case).
 * For using qualifier, we have to remove previous doctype and will have to enter new namespace with opening beans tag.
 */



 
