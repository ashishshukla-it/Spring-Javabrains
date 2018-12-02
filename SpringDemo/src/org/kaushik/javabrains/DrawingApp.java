package org.kaushik.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml"); 
	    Triangle triangle=(Triangle) context.getBean("triangle");
		triangle.draw();
		

	}

}

/* 
Output: 
Bean name is :triangle
PointA : ( 0 ,1)
PointB : ( 20 ,21)
PointC : ( 30 ,31)

Note that "Bean name is :triangle" is appearing first. This is because when beans were created, then only their setters were called.
*/
