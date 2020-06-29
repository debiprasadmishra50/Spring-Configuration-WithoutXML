package demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationDemoApp 
{
	public static void main(String[] args) 
	{
		// read the spring config class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		// retrieve the bean from spring container
		Coach theCoach = context.getBean("badmintonCoach", Coach.class);
		
		// call the methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}
}
