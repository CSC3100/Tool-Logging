package javiergs;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

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
