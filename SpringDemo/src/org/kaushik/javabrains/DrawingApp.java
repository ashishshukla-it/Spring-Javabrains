package org.kaushik.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class DrawingApp {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml"); 
	    context.registerShutdownHook();
		Triangle triangle=(Triangle) context.getBean("triangle");
		triangle.draw();
		

	}

}

/* 
Output: 
In before initialization method. Bean name is- pointA
In after initialization method. Bean name is- pointA
In before initialization method. Bean name is- pointB
In after initialization method. Bean name is- pointB
In before initialization method. Bean name is- pointC
In after initialization method. Bean name is- pointC
In before initialization method. Bean name is- triangle
In after initialization method. Bean name is- triangle
PointA : ( 0 ,1)
PointB : ( 20 ,21)
PointC : ( 30 ,31)
*/

// bean post process- Those processes that has to be done after the bean has been initialized