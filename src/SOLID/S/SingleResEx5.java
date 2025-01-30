package SOLID.S;

public class SingleResEx5 {
}
class Logger {
    public void logError(String message) {
        System.out.println("Error: " + message);
    }

    public void writeLogToFile(String message) {
        System.out.println("Writing log to file: " + message);
    }
}
