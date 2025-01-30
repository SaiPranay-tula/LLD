package SOLID.S;

public class SingleResEx1 {

    class ReportGenerator {
        public String generateReport() {
            return "Report Data";
        }
    }

    class ReportPrinter {
        public void print(String report) {
            System.out.println("Printing: " + report);
        }
    }

    class ReportSaver {
        public void save(String report) {
            System.out.println("Saving to DB: " + report);
        }
    }
}

class ReportGenerator_Problem {
    public void generateReport() {
        // Generate report logic
    }

    public void printReport() {
        // Printing logic
    }

    public void saveToDatabase() {
        // Database logic
    }
}




