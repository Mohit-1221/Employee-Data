package com.mohitaryanproject.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(DemoProjectApplication.class, args);

//		Controller controller = context.getBean(Controller.class);
//		System.out.println("the controller bean is: "+controller);
//
//		Service service = context.getBean(Service.class);
//		System.out.println("the service bean is: "+service);
//
//		Repository repository= context.getBean(Repository.class);
//		System.out.println("the repo bean is: "+repository);
//
//		BeanLister beanLister = context.getBean(BeanLister.class);
//		beanLister.listAllBeans();
	}

}
