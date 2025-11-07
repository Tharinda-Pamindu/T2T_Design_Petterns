import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private Logger() {
    }

    //On-demand Initialization (Thread-safe)
//    private static class LoggerHolder {
//        public static Logger INSTANCE = new Logger();
//    }
//
//    public static Logger getLogger() {
//        return LoggerHolder.INSTANCE;
//    }


    //Lazy Initialization (Thread-unsafe)
    private static Logger logger;

    public static Logger getLogger() {
        return logger = logger == null ? new Logger() : logger;
    }

    public void log(String message) {
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String date = time.format(formatter);
        System.out.println("[" + date + "] " + message);
    }
}
