public class SingletonDemo {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger();
        Logger logger2 = Logger.getLogger();
        System.out.println(logger==logger2);
        logger.log("No any errors in this file");
    }
}
