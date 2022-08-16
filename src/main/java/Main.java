import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Message info");
        logger.debug("Message debug");
        logger.error("Message error");
        logger.warn("Message warn");
        logger.trace("Message trace");
        logger.fatal("Message fatal");
    }
}
