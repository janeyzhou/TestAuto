package Core;

import org.apache.log4j.Logger;

public class Log {
	private static Logger logger = Logger.getLogger(Log.class.getName());
	
	public static void startTestCase(String testCaseName){
		logger.info("**********************************************************");
		logger.info("------------------   "+testCaseName+"   ------------------");
		logger.info("**********************************************************");
	}
	
	public static void endTestCase(){
		logger.info("xxxxxxxxxxxxxxxxxxxxxx   E---N---D   xxxxxxxxxxxxxxxxxxxxxx");
		logger.info("x");
		logger.info("x");
		logger.info("x");
	}
	
	public static void info(String message){
		logger.info(message);
	}
	
	public static void warn(String message){
		logger.warn(message);
	}

}
