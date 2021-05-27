package packageA;
import org.apache.logging.log4j.*;

public class classA1 {
	
	
	private static Logger log = LogManager.getLogger(classA1.class.getName());		
	// to use that jar we need to define logj manager, logmanager is api and getlogger is a function inside it, gelogger accepts class object i.e we need to mention in which class you are in 
	// we neeed to create a object for logger to start logging 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("I'm debugging");
		log.info("it is not present");
		if(5>4) {
			log.error("it is present");
			log.fatal("it is a fatal error");
			
		log.info("it is not present");
		}
		}

}
