package org.kaushik.javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {

	public static void main(String[] args) {
		//Triangle t =new Triangle();
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml"); // XmlBeanFactory because here we will use xml configuration file 
		Triangle triangle=(Triangle) context.getBean("triangle");
		triangle.draw();
		

	}

}
