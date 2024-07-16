package javiergs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A simple class that uses the SLF4J logging framework.
 *
 * @author javiergs
 * @version 1.0
 */
public class Main {
	
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(Main.class);
		logger.trace("This is for tracing");
		logger.debug("This is for debugging");
		logger.info("This is just for information");
		logger.warn("This is warnings");
		logger.error("This is for errors");
	}
	
}