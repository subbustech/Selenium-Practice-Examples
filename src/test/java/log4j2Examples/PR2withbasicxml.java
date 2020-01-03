package log4j2Examples;

import org.apache.logging.log4j.*;

public class PR2withbasicxml {
	
	//Just run it before including the xml and you will see only error and fatal
	//as it uses the default configuration which logs only error and fatal messages
	private static Logger log = LogManager.getLogger(PR2withbasicxml.class.getName());

	public static void main(String[] args) {
		log.trace("This is trace message");
		log.debug("This is debug message");
		log.info("This is info message");
		log.warn("This is warn message");
		log.error("This is error message");
		log.fatal("This is fatal message");
		

	}
}
//put the log4j2.xml file under resources folder and go to
//build path -> use as source folder or configure build path and add the resources folder to sources tab
//Result:
//00:59:37.326 [main] TRACE log4j2Examples.PR2withbasicxml - This is trace message
//00:59:37.343 [main] DEBUG log4j2Examples.PR2withbasicxml - This is debug message
//00:59:37.343 [main] INFO  log4j2Examples.PR2withbasicxml - This is info message
//00:59:37.343 [main] ERROR log4j2Examples.PR2withbasicxml - This is error message
//00:59:37.343 [main] FATAL log4j2Examples.PR2withbasicxml - This is fatal message