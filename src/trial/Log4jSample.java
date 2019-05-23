package trial;

import java.util.Enumeration;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log4jSample {

	public static void main(String[] args) {
		Logger logger1 = LogManager.getLogger("Logger1");
		Logger logger2 = LogManager.getLogger("Logger2");
		Logger logger3 = LogManager.getLogger("Logger3");
		BasicConfigurator.configure();
		logger1.info("This is logger1");
		logger2.info("This is logger2");
		logger3.info("This is logger3");
		
		Logger rootlogger = LogManager.getRootLogger();
		Logger rootOf1 = logger1.getRootLogger();
		
		if(rootOf1.equals(rootlogger)) {
			rootOf1.info("Both rootLogger and rootOf1 are same objects");
			rootOf1.info("The name of root logger is :" + rootlogger.getName());
		}else {
			rootOf1.info("Both rootLogger and rootOf1 are different objects");
		}
		
		Enumeration loggers = LogManager.getCurrentLoggers();
		while(loggers.hasMoreElements()) {
			logger3.info("logger name is :" +loggers.nextElement().getClass());
		}
		
		Logger logger1_2 = LogManager.getLogger("Logger1");
		 Logger logger1_3 = LogManager.getLogger("Logger1");
		 logger1_2.info("The name of this logger is " + logger1_2.getName());
		 
	        if(logger1_3.equals(logger1))
	        {
	         logger1_3.info("Both objects are same");
	        }
	        else
	        {
	         logger1_3.info("Logger1 and logger1_2 are different objects");
	        }
		

	}

}
