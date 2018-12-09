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
		context.registerShutdownHook();
		Shape shape=(Shape) context.getBean("circle");
		shape.draw();
	}
}

/* 
Output:
Init of circle
Drawing circle
( 30,31)
Dec 08, 2018 1:13:57 PM org.springframework.context.support.ClassPathXmlApplicationContext doClose
INFO: Closing org.springframework.context.support.ClassPathXmlApplicationContext@4534b60d: startup date [Sat Dec 08 13:13:57 IST 2018]; root of context hierarchy
Destroy of circle
*/

/* Component annotation above the class declaration tells spring that this class is a bean.
 * Then in xml, we don't have to create a bean for that class.
 * But this has a limitation.
 * We can do so only for those classes for which only one bean has to created.
 * For example, in point class, there are multiple beans being created for it in xml. So we cannot use @Component for Point class.
 * Also we have add '<context:component-scan base-package="org.kaushik.javabrains" />'. 
 * This tells spring to scan all the classes in the mentioned package to check whether any of them has @Component so that can be used as bean.
 * Apart from @Component, we can also use @Repository, @Controller or @Service.
 * Actually these all are stereotypes that gives spring an additional information that for what purpose these are.
 */



 
