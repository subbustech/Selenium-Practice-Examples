package log4j2Examples;

import org.apache.logging.log4j.*;

public class PR1withoutxml {
	
	//Just run it before including the xml and you will see only error and fatal
	//as it uses the default configuration which logs only error and fatal messages
	private static Logger log = LogManager.getLogger(PR1withoutxml.class.getName());

	public static void main(String[] args) {
		
		log.debug("This is debug message");
		log.info("This is info message");
		log.error("This is error message");
		log.fatal("This is fatal message");

	}
}

//Result:
//ERROR StatusLogger No Log4j 2 configuration file found. Using default configuration (logging only errors to the console), or user programmatically provided configurations. Set system property 'log4j2.debug' to show Log4j 2 internal initialization logging. See https://logging.apache.org/log4j/2.x/manual/configuration.html for instructions on how to configure Log4j 2
//00:06:05.887 [main] ERROR log4j2Examples.withoutxml - This is error message
//00:06:05.890 [main] FATAL log4j2Examples.withoutxml - This is fatal message