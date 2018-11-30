package org.kaushik.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class DrawingApp {

	public static void main(String[] args) {
		//Triangle t =new Triangle();
		// BeanFactory factory= new XmlBeanFactory(new FileSystemResource("spring.xml")); // XmlBeanFactory because here we will use xml configuration file 
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml"); // ApplicationContext can do everything that bean factory does, along with that it has some extra advantages and has same weight
		// Both line 17 and 18 will yield same result
		Triangle triangle=(Triangle) context.getBean("triangle");
		triangle.draw();
		

	}

}

/* 
Output: 
Point : ( 0 ,1)
Point : ( 20 ,21)
Point : ( 30 ,31)
*/
