package org.kaushik.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml"); 
	    Triangle triangle=(Triangle) context.getBean("triangle1");
	    Triangle newtriangle=(Triangle) context.getBean("triangle2");
		triangle.draw();
		newtriangle.draw();
		

	}

}

/* 
Output: 
Bean name is :Parenttriangle
Bean name is :triangle1
Bean name is :triangle2
PointA : ( 0 ,1)
PointB : ( 20 ,21)
PointC : ( 30 ,31)
PointA : ( 0 ,1)
PointB : ( 20 ,21)
Exception in thread "main" java.lang.NullPointerException

*/
