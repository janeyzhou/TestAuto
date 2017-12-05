package Utils;

import java.util.logging.Logger;

public class Log {
	
	private static Logger Log = Logger.getAnonymousLogger(Log.class.getName());
	
	public static void startTestCase(String testCaseName){
		Log.info("****************************************************************");
		Log.info("********************************"+testCaseName+"********************************");
		Log.info("****************************************************************");
	}
	
	public static void endTestCase(){
		Log.info("---------------------------E--N--D----------------------------");
	}
	
	public static void info(String message){
		Log.info(message);
	}
	
	public static void warn(String message){
		Log.info(message);
	}
}
