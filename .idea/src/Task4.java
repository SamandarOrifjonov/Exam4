import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.*;

public class Task4 {

    private final static Logger logger = Logger.getLogger(Task4.class.getName());
    public static void main(String[] args) throws IOException {

       logger.log(new LogRecord(Level.INFO,"info msg"));

        logger.setLevel(Level.FINE);
        logger.fine("fine msg");
    }
}
