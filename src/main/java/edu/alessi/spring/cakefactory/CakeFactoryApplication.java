package edu.alessi.spring.cakefactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Bruno Alessi
 * @since Jan 3, 2021
 */
@Slf4j
@SpringBootApplication
@SuppressWarnings({"unused", "resource"})
public class CakeFactoryApplication {

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
