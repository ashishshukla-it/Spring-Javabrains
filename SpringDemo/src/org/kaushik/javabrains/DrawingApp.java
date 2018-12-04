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
My bean factory post processor called
PointA : ( 0 ,1)
PointB : ( 20 ,21)
PointC : ( 30 ,31)
*/

/*
 BeanFactoryPostProcessor operates on bean definition i.e. before the bean instance is getting created it gets executed and BeanPostProcessor gets executed after bean is instantiated and lifecycle events are called.
 */ 
