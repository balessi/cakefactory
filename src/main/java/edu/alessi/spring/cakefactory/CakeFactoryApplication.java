package edu.alessi.spring.cakefactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Bruno Alessi
 * @since Jan 3, 2021
 */
// @SpringBootApplication is a composite application that combines three other annotations:
// 1) @SpringBootConfiguration —-> Designates this class as a configuration class.
//    You can add Java-based Spring Framework configuration to this class if you need to. This annotation is a specialized form of the @Configuration annotation.
// 2) @EnableAutoConfiguration —-> Tells Spring Boot to automatically configure any components that it thinks you’ll need.
// 3) @ComponentScan —-> Enables component scanning. This lets you declare other classes with annotations like @Component, @Controller, @Service,
//    and others, to have Spring automatically discover them and register them as components in the Spring application context.
@Slf4j
@SpringBootApplication
@SuppressWarnings({"unused", "resource"})
public class CakeFactoryApplication {

	/**
	 * This is the method that will be run when the JAR file is executed.
	 * The SpringApplication.run() method  performs the actual bootstrapping of the application, creating the Spring application context
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(CakeFactoryApplication.class, args);
		//exit(ctx);
	}

	/**
	 * @see org.springframework.boot.SpringApplication#exit
	 * @param ctx the context to close if possible
	 */
	private static void exit(final ConfigurableApplicationContext ctx) {
		int exitCode = SpringApplication.exit(ctx, () -> 0);
		log.debug("Exiting {} with code {}... ", CakeFactoryApplication.class, exitCode);
		System.exit(exitCode);
	}

}
