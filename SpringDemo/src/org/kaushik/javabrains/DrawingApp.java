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
	    /* 
	     * In spring, registerShutdownHook() method is used to shut down IoC container in non-web applications.
	     * It shuts down IoC container gracefully. 
	     * In non web based application like desk top application it is required to call registerShutdownHook. 
	     * In our desktop application we need to release all resources used by our spring application. 
	     * So we need to ensure that after application is finished, destroy method on our beans should be called. 
	     * In web-based application ApplicationContext already implements code to shut down the IoC container properly. 
	     * But in desktop application we need to call registerShutdownHook to shutdown IoC container properly.*/
		Triangle triangle=(Triangle) context.getBean("triangle");
		triangle.draw();
		

	}

}

/* 
Output: 
InitializingBean init method called for triangle
PointA : ( 0 ,1)
PointB : ( 20 ,21)
PointC : ( 30 ,31)
DisposableBean destroy method called for triangle
*/
