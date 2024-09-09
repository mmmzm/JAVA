
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Log4j2Main {

	
	static final Logger LOG = LogManager.getLogger(Log4j2Main.class);
	
	
	public static void main(String[] args) {
		//fatal > error > info > debug > trace
		LOG.debug("debug");
		LOG.info("info");
		LOG.warn("warn");
		LOG.error("error");
		LOG.fatal("fatal");

	}

}
