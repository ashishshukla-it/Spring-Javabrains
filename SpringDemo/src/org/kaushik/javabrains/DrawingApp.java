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
InitializingBean init method called for triangle
MyInit() method called for triangle
PointA : ( 0 ,1)
PointB : ( 20 ,21)
PointC : ( 30 ,31)
DisposableBean destroy method called for triangle
MyDestroy() method called for triangle
*/

// This is to show the order in which inbuilt and customized methods have been executed